package util;

import org.apache.commons.lang3.StringUtils;
import org.docx4j.TextUtils;
import org.docx4j.TraversalUtil;
import org.docx4j.XmlUtils;
import org.docx4j.finders.RangeFinder;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.io.SaveToZipFile;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.openpackaging.parts.relationships.Namespaces;
import org.docx4j.wml.*;
import util.knowledge.KnowledgeModel;

import javax.xml.bind.JAXBElement;
import java.io.File;
import java.io.StringWriter;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author miaoyu
 * @date 2018/6/21 09:51
 */
public class Docx4JUtil {
    /**
     * 表头所含标签
     */
    private static final String[] HEADER_TAG = {"试卷编码","试卷名","试卷标题","描述说明","版本号","录入人","录入时间","备注"};
    /**
     * 选择题所含标签
     */
    private static final String[] CHOICE_TAG = {"题目编号","版本号","题目类型","题干","选项A","选项B","选项C","选项D","答案","解析","年级","难度系数","知识点","科目"};
    /**
     * 背诵题所含标签
     */
    private static final String[] RECITATION_TAG = {"题目编号","版本号","题目类型","题干","答案","年级","难度系数","知识点","科目"};

    /**
     * 从原HTML文本中提取纯文本
     * @param origin 原文本
     * @return 纯文本字符串
     */
    public String getTxtContent(String origin){
        String reg = ">([^<>]+)<";
        Pattern pattern = Pattern.compile(reg,Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(origin);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            sb.append(matcher.group(1));
        }
        return sb.toString();
    }

    /**
     * 读一个知识点文档
     * @param filePath 文件路径
     * @return 模板对象
     */
    public KnowledgeModel readKnowledgeDocx(String filePath) throws Exception{
        KnowledgeModel knowledgeModel = new KnowledgeModel();
        if(filePath == null){
            return null;
        }
        WordprocessingMLPackage wordprocessingMLPackage = getReadWordprocessingMLPackage(filePath);
        if(wordprocessingMLPackage == null){
            return null;
        }
        List<Tbl> tables = getAllTbl(wordprocessingMLPackage);
        if(tables == null || tables.isEmpty()){
            return null;
        }
        knowledgeModel.setKnowledgeID(readKnowledgeTitle(tables.get(0)));
        knowledgeModel.setData(readSubOrKnowTable(tables.get(0)));
        return knowledgeModel;
    }

    private String readKnowledgeTitle(Tbl tbl) throws Exception {
        return getElementContent(getTc(tbl,0,0));
    }

    /**
     * 读入一个科目文档
     * @param filePath 文件路径
     * @return 科目序列
     */
    public List<TreeNode> readSubjectDocx(String filePath) throws Exception {
        if(filePath == null){
            return null;
        }
        WordprocessingMLPackage wordprocessingMLPackage = getReadWordprocessingMLPackage(filePath);
        if(wordprocessingMLPackage == null){
            return null;
        }
        List<Tbl> tables = getAllTbl(wordprocessingMLPackage);
        if(tables == null || tables.isEmpty()){
            return null;
        }
        return readSubOrKnowTable(tables.get(0));
    }

    /**
     * 读入一个表格中的学科或知识点信息
     * @param table 表格对象
     * @return 节点序列
     */
    private List<TreeNode> readSubOrKnowTable(Tbl table) throws Exception {
        List<TreeNode> result = new ArrayList<>();
        if(table == null){
            return null;
        }
        List<Tr> trList = getTblAllTr(table);
        if(trList == null || trList.isEmpty()){
            return null;
        }
        for (int i = 2;i < trList.size();i++) {
            TreeNode node = readSubOrKnowTr(trList.get(i));
            if (node == null){
                return null;
            }
            result.add(node);
        }
        return result;
    }

    /**
     * 将一行内容读入节点对象
     * @param tr 行对象
     * @return 节点对象
     */
    private TreeNode readSubOrKnowTr(Tr tr) throws Exception {
        if(tr == null){
            return null;
        }
        List<Tc> tcList = getTrAllCell(tr);
        if(tcList == null || tcList.isEmpty()){
            return null;
        }
        TreeNode node = new TreeNode();
        node.setLevel(getElementContent(tcList.get(1)));
        node.setName(getElementContent(tcList.get(2)));
        node.setDescription(getElementContent(tcList.get(4)));
        node.setCreateTime(getElementContent(tcList.get(5)));
        node.setCreateUser(getElementContent(tcList.get(6)));
        node.setLastUpdateTime(getElementContent(tcList.get(7)));
        node.setLastUpdateUser(getElementContent(tcList.get(8)));
        return node;
    }

    /**
     * 读入一个试题模板文档
     * @param filePath 文档路径
     * @return 包含表头和试题表格内容的map序列
     */
    public List<Map<String,String>> readQuestionDocx(String filePath) throws Exception {
        if(filePath == null){
            return null;
        }
        List<Map<String,String>> result = new ArrayList<>();
        WordprocessingMLPackage wordprocessingMLPackage = getReadWordprocessingMLPackage(filePath);
        if(wordprocessingMLPackage == null){
            return null;
        }
        Map<String,String> header;
        List<Map<String,String>> questions;
        //读表头
        if((header = readHeader(wordprocessingMLPackage)) == null){
            return null;
        }
        result.add(header);
        //读试题
        if((questions = readQuestions(wordprocessingMLPackage)) == null){
            return null;
        }
        result.addAll(questions);
        return result;
    }

    /**
     * 读取表头
     * @param wordprocessingMLPackage 文档WordprocessingMLPackage对象
     * @return 表头信息Map
     */
    private Map<String,String> readHeader(WordprocessingMLPackage wordprocessingMLPackage)throws Exception{
        if(wordprocessingMLPackage == null){
            return null;
        }
        List<Tbl> list = getAllTbl(wordprocessingMLPackage);
        if(list == null||list.isEmpty()){
            return null;
        }
        return readTable(list.get(0));
    }

    /**
     * 读入一个Word文档中的试题
     * @param wordprocessingMLPackage 文档WordprocessingMLPackage对象
     * @return 文档中所有试题表格的Map序列
     */
    private List<Map<String,String>> readQuestions(WordprocessingMLPackage wordprocessingMLPackage) throws Exception {
        List<Map<String,String>> result = new ArrayList<>();
        if(wordprocessingMLPackage == null){
            return null;
        }
        List<Tbl> list = getAllTbl(wordprocessingMLPackage);
        if(list == null||list.isEmpty()){
            return null;
        }
        //去除表头表格
        list.remove(0);
        for (Tbl tbl : list) {
            result.add(readTable(tbl));
        }
        return result;
    }

    /**
     * 将内容写入学科文档
     * @param filePath 文件路径
     * @param list 节点序列
     * @return 是否写入成功
     */
    public boolean writeSubjectDocx(String filePath,List<TreeNode> list) throws Exception {
        WordprocessingMLPackage wordprocessingMLPackage;
        File file = new File(filePath);
        wordprocessingMLPackage = getWriteWordprocessingMLPackage(file,filePath);
        if(wordprocessingMLPackage == null){
            return false;
        }
        if(list == null || list.isEmpty()){
            return false;
        }
        Collections.sort(list);
        setDocumentSize(wordprocessingMLPackage);
        Tbl tbl = createTable(wordprocessingMLPackage,list.size()+2,9);
        if(!writeSubjectTitle(wordprocessingMLPackage,tbl)){
            return false;
        }
        if(!writeSubOrKnowledgeTable(wordprocessingMLPackage,tbl,list)){
            return false;
        }
        wordprocessingMLPackage.getMainDocumentPart().addObject(tbl);
        wordprocessingMLPackage.getMainDocumentPart().addParagraphOfText("\n");
        wordprocessingMLPackage.save(file);
        return true;
    }

    /**
     * 写入科目表格标题
     * @param wordprocessingMLPackage
     * @param tbl
     * @return
     */
    private boolean writeSubjectTitle(WordprocessingMLPackage wordprocessingMLPackage,Tbl tbl){
        if(tbl == null || wordprocessingMLPackage == null) {
            return false;
        }
        P p;
        mergeCellsHorizontal(tbl,0,5,8);
        mergeCellsHorizontal(tbl,0,0,4);

        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("科目索引目录");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,0,0).getContent().set(0,p);

        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("更新信息");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,0,5).getContent().set(0,p);

        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("序号");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,0).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("大纲级号");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,1).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("科目名称");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,2).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("科目名称");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,3).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("描述说明");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,4).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("创建日期");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,5).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("创建人");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,6).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("最近修改日期");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,7).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("最近修改人员");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,8).getContent().set(0,p);

        return true;
    }

    /**
     * 将内容写入知识点文档
     * @param filePath 文件路径
     * @param model 知识点模板
     * @return 是否写入成功
     */
    public boolean writeKnowledgeDocx(String filePath,KnowledgeModel model) throws Exception{
        WordprocessingMLPackage wordprocessingMLPackage;
        File file = new File(filePath);
        wordprocessingMLPackage = getWriteWordprocessingMLPackage(file,filePath);
        if(wordprocessingMLPackage == null){
            return false;
        }
        if(model == null || model.getData() == null || model.getData().isEmpty() ||model.getKnowledgeID() == null || "".equals(model.getKnowledgeID())){
            return false;
        }
        Collections.sort(model.getData());
        setDocumentSize(wordprocessingMLPackage);
        Tbl tbl = createTable(wordprocessingMLPackage,model.getData().size()+2,9);
        if(!writeKnowledgeTitle(wordprocessingMLPackage,tbl,model.getKnowledgeID())){
            return false;
        }
        if(!writeSubOrKnowledgeTable(wordprocessingMLPackage,tbl,model.getData())){
            return false;
        }
        wordprocessingMLPackage.getMainDocumentPart().addObject(tbl);
        wordprocessingMLPackage.getMainDocumentPart().addParagraphOfText("\n");
        wordprocessingMLPackage.save(file);
        return true;
    }

    /**
     * 写入知识点表格标题
     * @param wordprocessingMLPackage
     * @param tbl
     * @param title 形式为： 学科名_学科级号 的字符串
     * @return
     */
    private boolean writeKnowledgeTitle(WordprocessingMLPackage wordprocessingMLPackage,Tbl tbl,String title){
        if(tbl == null || wordprocessingMLPackage == null) {
            return false;
        }
        P p;
        mergeCellsHorizontal(tbl,0,5,8);
        mergeCellsHorizontal(tbl,0,0,4);

        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(title);
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,0,0).getContent().set(0,p);

        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("更新信息");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,0,5).getContent().set(0,p);

        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("序号");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,0).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("大纲级号");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,1).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("知识点名称");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,2).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("知识点名称");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,3).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("描述说明");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,4).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("创建日期");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,5).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("创建人");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,6).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("最近修改日期");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,7).getContent().set(0,p);
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText("最近修改人员");
        setAlign(p,JcEnumeration.CENTER);
        getTc(tbl,1,8).getContent().set(0,p);

        return true;
    }

    /**
     * 将内容写入科目或知识点表格
     * @param wordprocessingMLPackage
     * @param tbl
     * @param list
     * @return
     */
    private boolean writeSubOrKnowledgeTable(WordprocessingMLPackage wordprocessingMLPackage,Tbl tbl,List<TreeNode> list){
        if(tbl == null || list == null || list.size()<2){
            return false;
        }
        TreeNode node;
        P p;
        for (int i = 0; i < list.size(); i++) {
            node = list.get(i);
            //序号
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(String.valueOf(i+1));
            setAlign(p,JcEnumeration.CENTER);
            getTc(tbl,i+2,0).getContent().set(0,p);
            //级号
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getLevel());
            getTc(tbl,i+2,1).getContent().set(0,p);
            //名称
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getName());
            getTc(tbl,i+2,2).getContent().set(0,p);
            //缩进名称
            String indented = indentName(node.getLevel(),node.getName());
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(indented);
            getTc(tbl,i+2,3).getContent().set(0,p);

            //描述说明
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getDescription());
            getTc(tbl,i+2,4).getContent().set(0,p);
            //创建日期
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getCreateTime());
            getTc(tbl,i+2,5).getContent().set(0,p);
            //创建人
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getCreateUser());
            getTc(tbl,i+2,6).getContent().set(0,p);
            //最近修改日期
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getLastUpdateTime());
            getTc(tbl,i+2,7).getContent().set(0,p);
            //最近修改人
            p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(node.getLastUpdateUser());
            getTc(tbl,i+2,8).getContent().set(0,p);
        }
        return true;
    }

    private String indentName(String level,String name){
        StringBuffer sb = new StringBuffer();
        String[] array = level.split("\\.");
        for (int i = 0; i < array.length-1; i++) {
            sb.append("    ");
        }
        sb.append(name);
        return sb.toString();
    }

    /**
     * 将内容写入试题模板文档
     * @param filePath 文档路径
     * @param content 内容（包含表头和试题表格）
     * @return 是否成功 true:成功 false:失败
     */
    public boolean writeQuestionDocx(String filePath,List<Map<String,String>> content) throws Exception {
        WordprocessingMLPackage wordprocessingMLPackage;
        File file = new File(filePath);
        wordprocessingMLPackage = getWriteWordprocessingMLPackage(file,filePath);
        if(wordprocessingMLPackage == null){
            return false;
        }
        if(content == null || content.isEmpty() || content.size()<2){
            return false;
        }
        Map<String,String> header = content.get(0);
        //写入表头
        if(!writeHeader(wordprocessingMLPackage,header)){
            return false;
        }
        content.remove(0);
        //写入试题
        if(!writeQuestions(wordprocessingMLPackage,content)){
            return false;
        }
        wordprocessingMLPackage.save(file);
        return true;
    }

    /**
     * 创建文档
     * @param path 文档路径
     * @return 是否创建成功
     */
    private boolean createDocx(String path) throws Exception {
        SaveToZipFile saver = null;
        saver = new SaveToZipFile(WordprocessingMLPackage.createPackage());
        saver.save(path);
        return true;
    }

    /**
     * 写入表头
     * @param wordprocessingMLPackage wordprocessingMLPackage对象
     * @param map 包含表头内容的map对象
     * @return 是否成功 true:成功 false:失败
     */
    private boolean writeHeader(WordprocessingMLPackage wordprocessingMLPackage,Map<String,String> map) throws Exception {
        if(wordprocessingMLPackage == null){
            return false;
        }
        if(map == null || map.isEmpty()){
            return false;
        };
        return writeTable(wordprocessingMLPackage,map, HEADER_TAG);
    }

    /**
     * 写入试题表格
     * @param wordprocessingMLPackage WordprocessingMLPackage对象
     * @param list 包含试题内容的map序列
     * @return 是否成功 true:成功 false:失败
     */
    private boolean writeQuestions(WordprocessingMLPackage wordprocessingMLPackage,List<Map<String,String>> list) throws Exception {
        if(wordprocessingMLPackage == null){
            return false;
        }
        if(list == null || list.isEmpty()){
            return false;
        }
        //写入序列中的每一个试题表格
        for (Map<String, String> map : list) {
            String type = map.get("题目类型");
            if(type == null||"".equals(type.trim())){
                return false;
            }
            //判断试题是选择题还是背诵题
            if("选择题".equals(type)){
                if(!writeTable(wordprocessingMLPackage,map,CHOICE_TAG)){
                    return false;
                }
            }else if("背诵题".equals(type)){
                if(!writeTable(wordprocessingMLPackage,map, RECITATION_TAG)){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }

    /**
     * 写入一个表格,可写入试题或表头
     * @param wordprocessingMLPackage WordprocessingMLPackage对象
     * @param map 包含表格内容的map对象
     * @param tags 对应表格的标签序列
     * @return
     */
    private boolean writeTable(WordprocessingMLPackage wordprocessingMLPackage,Map<String,String> map,String[] tags) throws Exception {
        if(wordprocessingMLPackage == null || map == null || map.isEmpty() || tags.length <=0){
            return false;
        }
        //创建表格
        Tbl tbl = createTable(wordprocessingMLPackage,tags.length,2);
        //填入内容
        for (int i = 0;i< tags.length;i++) {
            String value = map.get(tags[i]);
            if(value == null){
                return false;
            }
            if(!writeTr(wordprocessingMLPackage,tbl,tags[i],value,i)){
                return false;
            }
        }
        wordprocessingMLPackage.getMainDocumentPart().addObject(tbl);
        wordprocessingMLPackage.getMainDocumentPart().addParagraphOfText("\n");
        return true;
    }

    /**
     * 读取一个表格
     * @param tbl 表格对象
     * @return 表格内容Map
     */
    private Map<String,String> readTable(Tbl tbl) throws Exception {
        if(tbl == null){
            return null;
        }
        Map<String,String> result = new HashMap<>();
        List<Tr> trList = getTblAllTr(tbl);
        for (Tr tr : trList) {
            readTr(tr,result);
        }
        return result;
    }

    /**
     * 读入一行
     * @param tr 表格行对象
     * @param map 存入的map对象
     */
    private void readTr(Tr tr,Map<String,String> map) throws Exception {
        if(tr == null){
            return;
        }
        if(map == null){
            return;
        }
        List<Tc> tcList = getTrAllCell(tr);
        if(tcList == null || tcList.isEmpty() || tcList.size()<2){
            return;
        }
        String key = getElementContent(tcList.get(0)).trim();
        String value = getElementContent(tcList.get(1)).trim();
        map.put(key,value);
    }

    /**
     * 根据文档路径获取读WordprocessingMLPackage对象
     * @param filePath 文件路径
     * @return WordprocessingMLPackage对象，当找不到文件时返回空
     */
    private WordprocessingMLPackage getReadWordprocessingMLPackage(String filePath) throws Docx4JException {
        File file = new File(filePath);
        if(!file.exists()){
            return null;
        }
        return WordprocessingMLPackage.load(file);
    }

    private WordprocessingMLPackage getWriteWordprocessingMLPackage(File file,String strDocFileName) throws Exception{
        if(file == null){
            return null;
        }
        WordprocessingMLPackage wordprocessingMLPackage;
        if(!file.exists()){
            if(!createDocx(strDocFileName)){
                return null;
            }
            wordprocessingMLPackage = getReadWordprocessingMLPackage(strDocFileName);
        }else {
            //避免对新建的空文档调用load方法产生异常
            if(file.length() == 0){
                wordprocessingMLPackage = WordprocessingMLPackage.createPackage();
            }else {
                wordprocessingMLPackage = getReadWordprocessingMLPackage(strDocFileName);
            }
        }
        return wordprocessingMLPackage;
    }


    /**
     * @Description:得到所有表格
     */
    private List<Tbl> getAllTbl(WordprocessingMLPackage wordMLPackage)
    {
        MainDocumentPart mainDocPart = wordMLPackage.getMainDocumentPart();
        List<Object> objList = getAllElementFromObject(mainDocPart, Tbl.class);
        if (objList == null)
        {
            return null;
        }
        List<Tbl> tblList = new ArrayList<Tbl>();
        for (Object obj : objList)
        {
            if (obj instanceof Tbl)
            {
                Tbl tbl = (Tbl) obj;

                tblList.add(tbl);
            }
        }
        return tblList;
    }

    /**
     * @Description: 得到表格所有的行
     */
    private List<Tr> getTblAllTr(Tbl tbl)
    {
        List<Object> objList = getAllElementFromObject(tbl, Tr.class);
        List<Tr> trList = new ArrayList<Tr>();
        if (objList == null)
        {
            return trList;
        }
        for (Object obj : objList)
        {
            if (obj instanceof Tr)
            {
                Tr tr = (Tr) obj;
                trList.add(tr);
            }
        }
        return trList;
    }

    /**
     * @Description: 获取一行所有的单元格
     */
    private List<Tc> getTrAllCell(Tr tr)
    {
        List<Object> objList = getAllElementFromObject(tr, Tc.class);
        List<Tc> tcList = new ArrayList<Tc>();
        if (objList == null)
        {
            return tcList;
        }
        for (Object tcObj : objList)
        {
            if (tcObj instanceof Tc)
            {
                Tc objTc = (Tc) tcObj;
                tcList.add(objTc);
            }
        }
        return tcList;
    }

    /**
     * @Description:得到指定类型的元素
     */
    private static List<Object> getAllElementFromObject(Object obj, Class<?> toSearch)
    {
        List<Object> result = new ArrayList<Object>();
        if (obj instanceof JAXBElement) {
            obj = ((JAXBElement<?>) obj).getValue();
        }
        if (obj.getClass().equals(toSearch)) {
            result.add(obj);
        } else if (obj instanceof ContentAccessor)
        {
            List<?> children = ((ContentAccessor) obj).getContent();
            for (Object child : children)
            {
                result.addAll(getAllElementFromObject(child, toSearch));
            }
        }
        return result;
    }

    /**
     * 获取元素的文本内容
     * @param obj 元素
     * @return 文本内容
     */
    private String getElementContent(Object obj) throws Exception
    {
        StringWriter stringWriter = new StringWriter();
        TextUtils.extractText(obj, stringWriter);
        return stringWriter.toString();
    }

    /**
     * 创建表格
     * @param wordMLPackage
     * @param rowNum
     * @param colsNum
     * @return
     * @throws Exception
     */
    private Tbl createTable(WordprocessingMLPackage wordMLPackage, int rowNum, int colsNum) throws Exception{
        colsNum = Math.max(1, colsNum);
        rowNum = Math.max(1, rowNum);
        int widthTwips = getWritableWidth(wordMLPackage);
        int colWidth = widthTwips / colsNum;
        int[] widthArr = new int[colsNum];
        for (int i = 0; i < colsNum; i++)
        {
            widthArr[i] = colWidth;
        }

        return createTable(rowNum,colsNum,widthArr);
    }

    /**
     * @Description:创建表格(默认水平居中,垂直居中)
     */
    private Tbl createTable(int rowNum, int colsNum, int[] widthArr) throws Exception
    {
        colsNum = Math.max(1, Math.min(colsNum, widthArr.length));
        rowNum = Math.max(1, rowNum);
        Tbl tbl = new Tbl();
        StringBuffer tblSb = new StringBuffer();
        tblSb.append("<w:tblPr ").append(Namespaces.W_NAMESPACE_DECLARATION).append(">");
        tblSb.append("<w:tblStyle w:val=\"TableGrid\"/>");
        tblSb.append("<w:tblW w:w=\"0\" w:type=\"auto\"/>");
        // 上边框
        tblSb.append("<w:tblBorders>");
        tblSb.append("<w:top w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
        // 左边框
        tblSb.append("<w:left w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
        // 下边框
        tblSb.append("<w:bottom w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
        // 右边框
        tblSb.append("<w:right w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
        tblSb.append("<w:insideH w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
        tblSb.append("<w:insideV w:val=\"single\" w:sz=\"1\" w:space=\"0\" w:color=\"auto\"/>");
        tblSb.append("</w:tblBorders>");
        tblSb.append("</w:tblPr>");
        TblPr tblPr = null;
        tblPr = (TblPr) XmlUtils.unmarshalString(tblSb.toString());
        Jc jc = new Jc();
        // 单元格居中对齐
        jc.setVal(JcEnumeration.CENTER);
        tblPr.setJc(jc);

        tbl.setTblPr(tblPr);

        // 设定各单元格宽度
        TblGrid tblGrid = new TblGrid();
        tbl.setTblGrid(tblGrid);
        for (int i = 0; i < colsNum; i++)
        {
            TblGridCol gridCol = new TblGridCol();
            gridCol.setW(BigInteger.valueOf(widthArr[i]));
            tblGrid.getGridCol().add(gridCol);
        }
        // 新增行
        for (int j = 0; j < rowNum; j++)
        {
            Tr tr = new Tr();
            tbl.getContent().add(tr);
            // 列
            for (int i = 0; i < colsNum; i++)
            {
                Tc tc = new Tc();
                tr.getContent().add(tc);

                TcPr tcPr = new TcPr();
                TblWidth cellWidth = new TblWidth();
                cellWidth.setType("dxa");
                cellWidth.setW(BigInteger.valueOf(widthArr[i]));
                tcPr.setTcW(cellWidth);
                tc.setTcPr(tcPr);

                // 垂直居中
                setTcVAlign(tc, STVerticalJc.CENTER);
                P p = new P();
                PPr pPr = new PPr();
                pPr.setJc(jc);
                p.setPPr(pPr);
                R run = new R();
                p.getContent().add(run);
                tc.getContent().add(p);
            }
        }
        return tbl;
    }

    /**
     * @Description：获取文档的可用宽度
     */
    private int getWritableWidth(WordprocessingMLPackage wordPackage) throws Exception
    {
        return wordPackage.getDocumentModel().getSections().get(0).getPageDimensions().getWritableWidthTwips();
    }

    /**
     * @Description: 设置单元格垂直对齐方式
     */
    private void setTcVAlign(Tc tc, STVerticalJc vAlignType)
    {
        if (vAlignType != null)
        {
            TcPr tcPr = getTcPr(tc);
            CTVerticalJc vAlign = new CTVerticalJc();
            vAlign.setVal(vAlignType);
            tcPr.setVAlign(vAlign);
        }
    }

    private TcPr getTcPr(Tc tc)
    {
        TcPr tcPr = tc.getTcPr();
        if (tcPr == null)
        {
            tcPr = new TcPr();
            tc.setTcPr(tcPr);
        }
        return tcPr;
    }

    /**
     * 设置单元格内容对齐方式
     * @param p 段落对象
     * @param jcEnumeration 对齐方式
     */
    private boolean setAlign(P p,JcEnumeration jcEnumeration){
        if(p == null){
            return false;
        }
        Jc jc = new Jc();
        jc.setVal(jcEnumeration);
        PPr ppr = new PPr();
        ppr.setJc(jc);
        p.setPPr(ppr);
        return true;
    }

    /**
     * 写入表格的一行
     * @param tbl 表格对象
     * @param tag 第一列标签
     * @param value 第二列内容
     * @param rowNum 行号
     * @return 是否写入成功
     */
    private boolean writeTr(WordprocessingMLPackage wordprocessingMLPackage,Tbl tbl,String tag,String value,int rowNum) throws Exception {
        if(wordprocessingMLPackage == null || tbl == null || tag == null || value == null || rowNum < 0){
            return false;
        }

        int maxWith = getWritableWidth(wordprocessingMLPackage);

        P p;
        //写入第一列标签
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(tag);
        //左对齐
        setAlign(p,JcEnumeration.LEFT);
        //加粗
        RPr rPr = new RPr();
        addRPrBoldStyle(rPr);
        R r = (R) p.getContent().get(0);
        r.setRPr(rPr);
        //列宽
        TcPr tcPr = new TcPr();
        TblWidth width = new TblWidth();
        width.setW(BigInteger.valueOf(1200));
        tcPr.setTcW(width);

        //底纹
        CTShd ctShd = new CTShd();
        ctShd.setColor("auto");
        ctShd.setFill("EEEEEE");
        tcPr.setShd(ctShd);

        getTc(tbl,rowNum,0).setTcPr(tcPr);
        getTc(tbl,rowNum,0).getContent().set(0,p);

        //写入第二列内容
        p = wordprocessingMLPackage.getMainDocumentPart().createParagraphOfText(value);
        setAlign(p,JcEnumeration.LEFT);
        TcPr tcPr2 = new TcPr();
        TblWidth width2 = new TblWidth();
        width2.setW(BigInteger.valueOf(maxWith-1200));
        tcPr2.setTcW(width2);
        getTc(tbl,rowNum,1).setTcPr(tcPr2);
        getTc(tbl,rowNum,1).getContent().set(0,p);
        return true;
    }

    /**
     * @Description: 加粗
     */
    public void addRPrBoldStyle(RPr runProperties)
    {
        BooleanDefaultTrue b = new BooleanDefaultTrue();
        b.setVal(true);
        runProperties.setB(b);
    }

    /**
     * @Description: 设置段落底纹(对整段文字起作用)
     */
    public void setParagraphShdStyle(P p, STShd shdType, String shdColor)
    {
        PPr ppr = getPPr(p);
        CTShd ctShd = ppr.getShd();
        if (ctShd == null)
        {
            ctShd = new CTShd();
        }
        if (StringUtils.isNotBlank(shdColor))
        {
            ctShd.setColor(shdColor);
        }
        if (shdType != null)
        {
            ctShd.setVal(shdType);
        }
        ppr.setShd(ctShd);
    }

    public PPr getPPr(P p)
    {
        PPr ppr = p.getPPr();
        if (ppr == null)
        {
            ppr = new PPr();
            p.setPPr(ppr);
        }
        return ppr;
    }

    /**
     * @Description:得到指定位置的单元格
     */
    public Tc getTc(Tbl tbl, int row, int cell)
    {
        if (row < 0 || cell < 0)
        {
            return null;
        }
        List<Tr> trList = getTblAllTr(tbl);
        if (row >= trList.size())
        {
            return null;
        }
        List<Tc> tcList = getTrAllCell(trList.get(row));
        if (cell >= tcList.size())
        {
            return null;
        }
        return tcList.get(cell);
    }

    /**
     * 获取所有书签
     * @param strDocFileName 文件名
     * @return 书签序列
     */
    public List<CTBookmark> readBookMark(String strDocFileName) throws Exception
    {
        WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(strDocFileName));
        MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();

        org.docx4j.wml.Document wmlDocumentEl = (org.docx4j.wml.Document) documentPart.getJaxbElement();
        Body body = wmlDocumentEl.getBody();

        Set<String> names = new HashSet<String>();
        Set<BigInteger> ids = new HashSet<BigInteger>();

        RangeFinder rt = new RangeFinder("CTBookmark", "CTMarkupRange");

        new TraversalUtil(body.getContent(), rt);

        return rt.getStarts();
    }

    public boolean writeBookMark(List<CTBookmark> list,String strDocFileName)throws Exception{
        if(strDocFileName == null || "".equals(strDocFileName.trim()) || list == null || list.isEmpty()){
            return false;
        }
        WordprocessingMLPackage wordprocessingMLPackage;
        File file = new File(strDocFileName);
        wordprocessingMLPackage = getWriteWordprocessingMLPackage(file,strDocFileName);
        if(wordprocessingMLPackage == null){
            return false;
        }
        for (CTBookmark ctBookmark : list) {
            //去除自动生成的用于记录上一次关闭时光标位置的书签
            if("_GoBack".equals(ctBookmark.getName())){
                continue;
            }
            P p = new P();
            wordprocessingMLPackage.getMainDocumentPart().getContent().add(0,p);
            R r = new R();
            p.getContent().add(0,r);
            if(!bookmarkRun(p,r,ctBookmark.getName(),ctBookmark.getId().intValue())){
                return false;
            }
        }
        wordprocessingMLPackage.save(file);
        return true;
    }


    /**
     * Surround the specified r in the specified p with a bookmark (with specified
     * name and id)
     *
     * @param p
     * @param r
     * @param name
     * @param id
     */
    protected boolean bookmarkRun(P p, R r, String name, int id)
    {
        // Find the index
        int index = p.getContent().indexOf(r);

        if (index < 0)
        {
            return false;
        }

        ObjectFactory factory = Context.getWmlObjectFactory();
        BigInteger ID = BigInteger.valueOf(id);

        // Add bookmark end first
        CTMarkupRange mr = factory.createCTMarkupRange();
        mr.setId(ID);
        JAXBElement<CTMarkupRange> bmEnd = factory.createBodyBookmarkEnd(mr);
        p.getContent().add(index + 1, bmEnd);

        // Next, bookmark start
        CTBookmark bm = factory.createCTBookmark();
        bm.setId(ID);
        bm.setName(name);
        JAXBElement<CTBookmark> bmStart = factory.createBodyBookmarkStart(bm);
        p.getContent().add(index, bmStart);
        return true;
    }

    /**
     * @Description: 跨列合并
     */
    public void mergeCellsHorizontal(Tbl tbl, int row, int fromCell, int toCell)
    {
        if (row < 0 || fromCell < 0 || toCell < 0)
        {
            return;
        }
        List<Tr> trList = getTblAllTr(tbl);
        if (row > trList.size())
        {
            return;
        }
        Tr tr = trList.get(row);
        List<Tc> tcList = getTrAllCell(tr);
        for (int cellIndex = fromCell, len = Math.min(tcList.size() - 1, toCell); cellIndex <= len; cellIndex++)
        {
            Tc tc = tcList.get(cellIndex);
            TcPr tcPr = getTcPr(tc);
            TcPrInner.HMerge hMerge = tcPr.getHMerge();
            if (hMerge == null)
            {
                hMerge = new TcPrInner.HMerge();
                tcPr.setHMerge(hMerge);
            }
            if (cellIndex == fromCell)
            {
                hMerge.setVal("restart");
            } else
            {
                hMerge.setVal("continue");
            }
        }
    }

    /**
     * @Description: 设置纸张大小landscape横向
     */
    public void setDocumentSize(WordprocessingMLPackage wordPackage)
    {
        SectPr sectPr = getDocSectPr(wordPackage);
        SectPr.PgSz pgSz = sectPr.getPgSz();
        if (pgSz == null)
        {
            pgSz = new SectPr.PgSz();
            sectPr.setPgSz(pgSz);
        }
        pgSz.setW(new BigInteger("28000"));
        pgSz.setH(new BigInteger("20000"));

    }

    public SectPr getDocSectPr(WordprocessingMLPackage wordPackage)
    {
        SectPr sectPr = wordPackage.getDocumentModel().getSections().get(0).getSectPr();
        return sectPr;
    }

}
