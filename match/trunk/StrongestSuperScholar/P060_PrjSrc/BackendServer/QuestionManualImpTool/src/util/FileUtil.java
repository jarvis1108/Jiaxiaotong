package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����ƥ���ļ����Ƿ�����û�Ҫ��
 * @author miaoyu
 * @date 2018/7/18 16:40
 */
public class FileUtil {
    /**
     * Ŀ¼
     */
    private String directory;
    /**
     * ��Ҫ���е�����ļ�����ƥ��
     */
    private List<String> selects;
    /**
     * ��Ҫ���ӵ��ļ�����ƥ��
     */
    private List<String> ignores;
    /**
     * �Ƿ�Ը�Ŀ¼���еݹ����
     */
    private boolean isRecursion;
    /**
     * ��Ҫ���е������Ŀ����
     */
    private List<String> questionTypes;
    /**
     * ��ʼ���û����
     */
    private String InitUserCode;
    /**
     * ��ʼ���û���
     */
    private String InitUserName;
    /**
     * ��ʼ������
     */
    private String InitName;
    /**
     * ��ʼ������
     */
    private String InitDes;
    /**
     * ��ʼ����ע
     */
    private String Init_Remark;

    private static Map<String,String> memberCodes;

    public String getInitUserCode() {
        return InitUserCode;
    }

    public String getInitUserName() {
        return InitUserName;
    }

    public String getInitName() {
        return InitName;
    }

    public String getInitDes() {
        return InitDes;
    }

    public String getInit_Remark() {
        return Init_Remark;
    }


    /**
     * ���캯��
     * @param filePath �����ļ���ַ
     */
    public FileUtil(String filePath) throws Exception {
        File configureFile = new File(filePath);
        if(!configureFile.exists()){
            throw new Exception("�����ļ������ڣ�");
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(configureFile));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = bufferedReader.readLine())!=null){
            sb.append(line);
        }
        JSONObject configure = JSON.parseObject(sb.toString());
        this.directory = configure.getString("directory");
        List<String> select = configure.getJSONArray("select").toJavaList(String.class);
        for (String str: select
             ) {
            select.set(select.indexOf(str),strToPattern(str));
        }
        this.selects = select;
        List<String> ignore = configure.getJSONArray("ignore").toJavaList(String.class);
        for(String str: ignore){
            ignore.set(ignore.indexOf(str),strToPattern(str));
        }
        this.ignores = ignore;
        this.isRecursion = configure.getBoolean("isRecursion");
        List<String> questionType = configure.getJSONArray("questionType").toJavaList(String.class);
        for(String str:questionType){
            questionType.set(questionType.indexOf(str),strToPattern(str));
        }
        this.questionTypes = questionType;
        this.InitUserCode = configure.getString("InitUserCode");
        this.InitUserName = configure.getString("InitUserName");
        this.InitName = configure.getString("InitName");
        this.InitDes = configure.getString("InitDes");
        this.Init_Remark = configure.getString("Remark");
        memberCodes = (Map<String, String>) configure.get("members");
        bufferedReader.close();
    }

    public static String getMemberName(String memberID){
        return memberCodes.get(memberID);
    }

    /**
     * ���û������ԭʼƥ���ʽ�ַ���ת��Ϊ��Ӧ��������ʽ
      * @param s
     * @return
     */
    private String strToPattern(String s){
        s = s.replace('.', '#');
        s = s.replaceAll("#", "\\\\.");
        s = s.replace('*', '#');
        s = s.replaceAll("#", ".*");
        s = s.replace('?', '#');
        s = s.replaceAll("#", ".?");
        s = "^" + s + "$";
        return s;
    }

    /**
     * �ж�һ���ļ����Ƿ���Ҫ���е���������ļ�
     * @param filename �ļ���
     * @return true:��Ҫ����  false������Ҫ����
     */
    private boolean isMatch(String filename){
        Pattern pattern;
        Matcher matcher;
        for (String ignore: this.ignores
             ) {
            pattern = Pattern.compile(ignore);
            matcher = pattern.matcher(filename);
            if (matcher.matches()){
                return false;
            }
        }
        for (String select:selects
             ) {
            pattern = Pattern.compile(select);
            matcher = pattern.matcher(filename);
            if (matcher.matches()){
                return true;
            }
        }
        return false;
    }

    /**
     * �ж�һ�����Ƿ�����Ҫ���������
     * @param questionType
     * @return
     */
    public boolean isToInit(String questionType){
        Pattern pattern;
        Matcher matcher;
        for(String type:this.questionTypes){
            pattern = Pattern.compile(type);
            matcher = pattern.matcher(questionType);
            if(matcher.matches()){
                return true;
            }
        }
        return false;
    }

    public List<String> getMatchedFiles() throws Exception {
        List<String> ret = new ArrayList<>();
        //TODO: ��ȡ������Ҫ���е�����ļ����б�
        File baseDir = new File(directory);
        if(!baseDir.exists()){
            throw new Exception("Ŀ¼���ļ�������");
        }
        //�����Ŀ¼��һ���ļ�
        if(baseDir.isFile()){
            if(isMatch(baseDir.getName())){
                ret.add(baseDir.getAbsolutePath());
            }
            return ret;
        }
        //�����Ŀ¼��һ��Ŀ¼
        else if(baseDir.isDirectory()){
            //��Ŀ¼�µ��ļ����б���
            File[] files = baseDir.listFiles();
            if(files == null||files.length == 0){
                throw new Exception("Ŀ��Ŀ¼Ϊ��");
            }
            for (File file:files
                 ) {
                //�����һ���ļ�
                if(file.isFile()){
                    if(isMatch(file.getName())){
                        ret.add(file.getAbsolutePath());
                    }
                }
                //�����һ��Ŀ¼
                else if(file.isDirectory()){
                    //���Ҫ���е�������
                    if(isRecursion){
                        //����Ŀ¼�µ��ļ�����
                        ret.addAll(searchDir(file));
                    }
                }
            }
            return ret;
        }else {
            throw new Exception("��Ŀ¼�����ļ���Ŀ¼!");
        }
    }

    private List<String> searchDir(File dir){
        List<String> ret = new ArrayList<>();
        File[] files = dir.listFiles();
        if(files == null || files.length == 0){
            return ret;
        }
        for (File file: files
             ) {
            if(file.isFile()){
                if(isMatch(file.getName())){
                    ret.add(file.getAbsolutePath());
                }
            }else if(file.isDirectory()) {
                ret.addAll(searchDir(file));
            }
        }
        return ret;
    }
}
