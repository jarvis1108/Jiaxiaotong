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
            //���������
            DBUtil.executeSave(initID,fileUtil.getInitUserCode(),fileUtil.getInitUserName(),fileUtil.getInitName(),fileUtil.getInitDes(),fileUtil.getInit_Remark());

            List<String> filenames = fileUtil.getMatchedFiles();
            Docx4JUtil docx4JUtil = new Docx4JUtil();

            for (String filename: filenames) {
                try{
                    //�Ƿ񽫸��ļ��е�����д洢
                    boolean isToSave = true;
                    //��������ظ�ʱʹ�õ��滻����
                    int questionCode = 5000;
                    //�洢��ǰ�ĵ����������
                    List<String> questionCodes =  new ArrayList<>();
                    //�洢���ļ��е���Ŀ
                    List<QuestionManual> questionManuals = new ArrayList<>();
                    List<QuestionMultipleChoiceManual> questionMultipleChoiceManuals = new ArrayList<>();
                    //��ȡ�����ļ�
                    List<Map<String,String>> list = docx4JUtil.readQuestionDocx(filename);
                    if(list == null || list.isEmpty() || list.size()<2){
                        throw new Exception("�ļ���ʽ������Ϊ��");
                    }
                    //��ͷ
                    Map<String,String> header = list.get(0);

                    if(CheckUtil.isNull(header.get("¼��ʱ��"))||!CheckUtil.isTime(header.get("¼��ʱ��"))){
                        header.put("¼��ʱ��","2018-07-18 8:30:00");
                    }

                    while(DBUtil.checkExaminationCodeExist(header.get("�Ծ����"))){
                        String origin = header.get("�Ծ����");
                        String toSave = origin.substring(0,origin.lastIndexOf("_")+1) + String.valueOf(code++);
                        System.out.println("�µ��Ծ���룺 "+ toSave);
                        System.out.println("�ļ��� " + filename);
                        System.out.println("ԭID�� "+ origin);
                        System.out.println();
                        header.put("�Ծ����",toSave);
                    }

                    List<Map<String,String>> questions = list.subList(1,list.size()-1);

                    for (Map<String,String> question:questions) {
                        if(question.get("��Ŀ����") == null ||!fileUtil.isToInit(question.get("��Ŀ����"))){
                            continue;
                        }
                        String questionID = UUID.randomUUID().toString();
                        String questionNo = CheckUtil.isNull(question.get("��Ŀ���"))?question.get("�����Ŀ"):question.get("��Ŀ���");
                        try{
                            QuestionMultipleChoiceManual questionMultipleChoiceManual = new QuestionMultipleChoiceManual(header,question,questionID,initID,initID,fileUtil.getInitUserName());
                            QuestionManual questionManual = new QuestionManual(header,question,questionID,initID,initID);
                            //����������ظ�
                            if(questionCodes.contains(questionNo)){
                                String newCode = String.valueOf(questionCode);
                                String newNo = header.get("�Ծ����")+"_"+newCode;
                                questionManual.setQuestionCode(newCode);
                                questionManual.setQuestionNo(newNo);
                                questionMultipleChoiceManual.setQuestionNo(newNo);
                                System.out.println();
                                System.out.println("������ID�� "+ newNo);
                                System.out.println("�ļ��� " + filename);
                                System.out.println("ԭID�� "+ questionNo);
                                System.out.println();
                                questionCode++;
                            }else{
                                questionCodes.add(questionNo);
                            }
                            questionManuals.add(questionManual);
                            questionMultipleChoiceManuals.add(questionMultipleChoiceManual);
                        }catch (Exception e){
                            isToSave = false;
                            writer.write("���⵼�����");
                            writer.newLine();
                            writer.write(filename + " :");
                            writer.newLine();
                            writer.write("�����ţ�"+questionNo);
                            writer.newLine();
                            writer.write(e.getMessage());
                            writer.newLine();
                            writer.newLine();
                            writer.flush();
                            continue;
                        }

                    }
                    //�ĵ�û�г��������´洢��ͬʱɾ��Դ�ļ�
                    if(isToSave){
                        DBUtil.batchSave(questionManuals);
                        DBUtil.batchSave(questionMultipleChoiceManuals);
                        File file = new File(filename);
                        file.delete();
                    }


                }catch (Exception e){
                    writer.write("�ĵ��������");
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
            writer.write(now.toString() + " �������");
            writer.newLine();
            writer.write(e.getMessage());
            writer.newLine();
            writer.newLine();
            writer.flush();
            e.printStackTrace();
            writer.close();
            return;
        }
        writer.write(now.toString() + " ���ε��������");
        writer.newLine();
        writer.flush();
        writer.close();
    }


}
