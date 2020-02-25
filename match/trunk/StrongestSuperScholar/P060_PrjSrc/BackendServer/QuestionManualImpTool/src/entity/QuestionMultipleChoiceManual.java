package entity;

import util.CheckUtil;
import util.FileUtil;
import util.TimeUtil;

import java.util.Date;
import java.util.Map;

/**
 * @author miaoyu
 * @date 2018/7/18 21:06
 */
public class QuestionMultipleChoiceManual {
    private String QuestionID;
    private String QuestionNo;
    private String InitID;
    private String InitNo;
    private Byte IsCorrect;
    private String ChoiceA;
    private String ChoiceB;
    private String ChoiceC;
    private String ChoiceD;
    private String Answer;
    private String CreateTime;
    private String CreateUser;
    private String CreateUsername;
    private String LastUpdTime;
    private String LastUpdUser;
    private String Remark;
    private Byte IsValid;

    public QuestionMultipleChoiceManual(Map<String, String> header, Map<String, String> map, String questionID, String initID, String initNo,  String initUserName) throws Exception {
        if(CheckUtil.isNull(header.get("�Ծ����"))){
            throw new Exception("�Ծ����Ϊ��");
        }
        String questionCode;
        if(CheckUtil.isNull(map.get("��Ŀ���"))&&CheckUtil.isNull(map.get("�����Ŀ"))){
            throw new Exception("��Ŀ���Ϊ��");
        }else {
            questionCode = map.get("��Ŀ���")==null?map.get("�����Ŀ"):map.get("��Ŀ���");
        }
        if(CheckUtil.isNull(map.get("��"))||map.get("��").length()>10){
            throw new Exception("�𰸴���");
        }
        if(CheckUtil.isNull(header.get("¼��ʱ��"))||!CheckUtil.isTime(header.get("¼��ʱ��"))){
            throw new Exception("¼��ʱ�����");
        }
        this.QuestionID = questionID;
        this.QuestionNo = header.get("�Ծ����")+"_"+questionCode;
        this.InitID = initID;
        this.InitNo = initNo;
        this.IsCorrect = new Byte("1");
        this.ChoiceA = map.get("ѡ��A");
        this.ChoiceB = map.get("ѡ��B");
        this.ChoiceC = map.get("ѡ��C");
        this.ChoiceD = map.get("ѡ��D");
        this.Answer = map.get("��");
        this.CreateTime = header.get("¼��ʱ��");
        this.CreateUser = header.get("¼����");
        this.CreateUsername = FileUtil.getMemberName(CreateUser);
        this.LastUpdTime = TimeUtil.getNow();
        this.LastUpdUser = header.get("¼����");
        this.Remark = header.get("��ע");
        this.IsValid = new Byte("1");
    }

    public String getQuestionID() {
        return QuestionID;
    }

    public void setQuestionID(String questionID) {
        QuestionID = questionID;
    }

    public String getQuestionNo() {
        return QuestionNo;
    }

    public void setQuestionNo(String questionNo) {
        QuestionNo = questionNo;
    }

    public String getInitID() {
        return InitID;
    }

    public void setInitID(String initID) {
        InitID = initID;
    }

    public String getInitNo() {
        return InitNo;
    }

    public void setInitNo(String initNo) {
        InitNo = initNo;
    }

    public Byte getIsCorrect() {
        return IsCorrect;
    }

    public void setIsCorrect(Byte isCorrect) {
        IsCorrect = isCorrect;
    }

    public String getChoiceA() {
        return ChoiceA;
    }

    public void setChoiceA(String choiceA) {
        ChoiceA = choiceA;
    }

    public String getChoiceB() {
        return ChoiceB;
    }

    public void setChoiceB(String choiceB) {
        ChoiceB = choiceB;
    }

    public String getChoiceC() {
        return ChoiceC;
    }

    public void setChoiceC(String choiceC) {
        ChoiceC = choiceC;
    }

    public String getChoiceD() {
        return ChoiceD;
    }

    public void setChoiceD(String choiceD) {
        ChoiceD = choiceD;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }

    public String getCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(String createUser) {
        CreateUser = createUser;
    }

    public String getCreateUsername() {
        return CreateUsername;
    }

    public void setCreateUsername(String createUsername) {
        CreateUsername = createUsername;
    }

    public String getLastUpdTime() {
        return LastUpdTime;
    }

    public void setLastUpdTime(String lastUpdTime) {
        LastUpdTime = lastUpdTime;
    }

    public String getLastUpdUser() {
        return LastUpdUser;
    }

    public void setLastUpdUser(String lastUpdUser) {
        LastUpdUser = lastUpdUser;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Byte getIsValid() {
        return IsValid;
    }

    public void setIsValid(Byte isValid) {
        IsValid = isValid;
    }
}
