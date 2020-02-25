package MyPkg;

import db.DBUtil;
import entity.QuestionManual;
import entity.QuestionMultipleChoiceManual;
import util.CheckUtil;
import util.Docx4JUtil;
import util.FileUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author miaoyu
 * @date 2018/7/18 16:21
 */
public class Import {
    private static int code = 20;
    public static void main(String[] args) throws IOException {
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat matter = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        File log = new File("log/log_"+matter.format(now)+".txt");
        if(!log.exists()){
            log.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(log));
        try{
            String initID = "INT_"+ UUID.randomUUID().toString();
            FileUtil fileUtil = new FileUtil("configure.json");
            //向主表插入
            DBUtil.executeSave(initID,fileUtil.getInitUserCode(),fileUtil.getInitUserName(),fileUtil.getInitName(),fileUtil.getInitDes(),fileUtil.getInit_Remark());

            List<String> filenames = fileUtil.getMatchedFiles();
            Docx4JUtil docx4JUtil = new Docx4JUtil();

            for (String filename: filenames) {
                try{
                    //是否将该文件中的题进行存储
                    boolean isToSave = true;
                    //试题编码重复时使用的替换编码
                    int questionCode = 5000;
                    //存储当前文档的试题编码
                    List<String> questionCodes =  new ArrayList<>();
                    //存储该文件中的题目
                    List<QuestionManual> questionManuals = new ArrayList<>();
                    List<QuestionMultipleChoiceManual> questionMultipleChoiceManuals = new ArrayList<>();
                    //读取试题文件
                    List<Map<String,String>> list = docx4JUtil.readQuestionDocx(filename);
                    if(list == null || list.isEmpty() || list.size()<2){
                        throw new Exception("文件格式不符或为空");
                    }
                    //表头
                    Map<String,String> header = list.get(0);

                    if(CheckUtil.isNull(header.get("录入时间"))||!CheckUtil.isTime(header.get("录入时间"))){
                        header.put("录入时间","2018-07-18 8:30:00");
                    }

                    while(DBUtil.checkExaminationCodeExist(header.get("试卷编码"))){
                        String origin = header.get("试卷编码");
                        String toSave = origin.substring(0,origin.lastIndexOf("_")+1) + String.valueOf(code++);
                        System.out.println("新的试卷编码： "+ toSave);
                        System.out.println("文件： " + filename);
                        System.out.println("原ID： "+ origin);
                        System.out.println();
                        header.put("试卷编码",toSave);
                    }

                    List<Map<String,String>> questions = list.subList(1,list.size()-1);

                    for (Map<String,String> question:questions) {
                        if(question.get("题目类型") == null ||!fileUtil.isToInit(question.get("题目类型"))){
                            continue;
                        }
                        String questionID = UUID.randomUUID().toString();
                        String questionNo = CheckUtil.isNull(question.get("题目编号"))?question.get("编号题目"):question.get("题目编号");
                        try{
                            QuestionMultipleChoiceManual questionMultipleChoiceManual = new QuestionMultipleChoiceManual(header,question,questionID,initID,initID,fileUtil.getInitUserName());
                            QuestionManual questionManual = new QuestionManual(header,question,questionID,initID,initID);
                            //如果试题编号重复
                            if(questionCodes.contains(questionNo)){
                                String newCode = String.valueOf(questionCode);
                                String newNo = header.get("试卷编码")+"_"+newCode;
                                questionManual.setQuestionCode(newCode);
                                questionManual.setQuestionNo(newNo);
                                questionMultipleChoiceManual.setQuestionNo(newNo);
                                System.out.println();
                                System.out.println("新试题ID： "+ newNo);
                                System.out.println("文件： " + filename);
                                System.out.println("原ID： "+ questionNo);
                                System.out.println();
                                questionCode++;
                            }else{
                                questionCodes.add(questionNo);
                            }
                            questionManuals.add(questionManual);
                            questionMultipleChoiceManuals.add(questionMultipleChoiceManual);
                        }catch (Exception e){
                            isToSave = false;
                            writer.write("试题导入出错！");
                            writer.newLine();
                            writer.write(filename + " :");
                            writer.newLine();
                            writer.write("试题编号："+questionNo);
                            writer.newLine();
                            writer.write(e.getMessage());
                            writer.newLine();
                            writer.newLine();
                            writer.flush();
                            continue;
                        }

                    }
                    //文档没有出错的情况下存储，同时删除源文件
                    if(isToSave){
                        DBUtil.batchSave(questionManuals);
                        DBUtil.batchSave(questionMultipleChoiceManuals);
                        File file = new File(filename);
                        file.delete();
                    }


                }catch (Exception e){
                    writer.write("文档导入出错！");
                    writer.newLine();
                    writer.write(filename + " :");
                    writer.newLine();
                    writer.write(e.getMessage());
                    writer.newLine();
                    writer.newLine();
                    writer.flush();
                    continue;
                }
            }

        }catch (Exception e){
            writer.write(now.toString() + " 导入出错！");
            writer.newLine();
            writer.write(e.getMessage());
            writer.newLine();
            writer.newLine();
            writer.flush();
            e.printStackTrace();
            writer.close();
            return;
        }
        writer.write(now.toString() + " 本次导入结束！");
        writer.newLine();
        writer.flush();
        writer.close();
    }


}
