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
 * 用于匹配文件名是否符合用户要求
 * @author miaoyu
 * @date 2018/7/18 16:40
 */
public class FileUtil {
    /**
     * 目录
     */
    private String directory;
    /**
     * 需要进行导入的文件名称匹配
     */
    private List<String> selects;
    /**
     * 需要忽视的文件名称匹配
     */
    private List<String> ignores;
    /**
     * 是否对该目录进行递归查找
     */
    private boolean isRecursion;
    /**
     * 需要进行导入的题目类型
     */
    private List<String> questionTypes;
    /**
     * 初始化用户编号
     */
    private String InitUserCode;
    /**
     * 初始化用户名
     */
    private String InitUserName;
    /**
     * 初始化名称
     */
    private String InitName;
    /**
     * 初始化描述
     */
    private String InitDes;
    /**
     * 初始化备注
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
     * 构造函数
     * @param filePath 配置文件地址
     */
    public FileUtil(String filePath) throws Exception {
        File configureFile = new File(filePath);
        if(!configureFile.exists()){
            throw new Exception("配置文件不存在！");
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
     * 将用户输入的原始匹配格式字符串转换为对应的正则表达式
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
     * 判断一个文件名是否需要进行导入操作的文件
     * @param filename 文件名
     * @return true:需要导入  false：不需要导入
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
     * 判断一个题是否是需要导入的类型
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
        //TODO: 获取所有需要进行导入的文件名列表
        File baseDir = new File(directory);
        if(!baseDir.exists()){
            throw new Exception("目录或文件不存在");
        }
        //如果根目录是一个文件
        if(baseDir.isFile()){
            if(isMatch(baseDir.getName())){
                ret.add(baseDir.getAbsolutePath());
            }
            return ret;
        }
        //如果根目录是一个目录
        else if(baseDir.isDirectory()){
            //对目录下的文件进行遍历
            File[] files = baseDir.listFiles();
            if(files == null||files.length == 0){
                throw new Exception("目标目录为空");
            }
            for (File file:files
                 ) {
                //如果是一个文件
                if(file.isFile()){
                    if(isMatch(file.getName())){
                        ret.add(file.getAbsolutePath());
                    }
                }
                //如果是一个目录
                else if(file.isDirectory()){
                    //如果要进行迭代查找
                    if(isRecursion){
                        //将该目录下的文件加入
                        ret.addAll(searchDir(file));
                    }
                }
            }
            return ret;
        }else {
            throw new Exception("根目录不是文件或目录!");
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
