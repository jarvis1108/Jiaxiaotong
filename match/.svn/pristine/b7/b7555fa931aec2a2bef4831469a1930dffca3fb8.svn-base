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
        if(CheckUtil.isNull(header.get("试卷编码"))){
            throw new Exception("试卷编码为空");
        }
        String questionCode;
        if(CheckUtil.isNull(map.get("题目编号"))&&CheckUtil.isNull(map.get("编号题目"))){
            throw new Exception("题目编号为空");
        }else {
            questionCode = map.get("题目编号")==null?map.get("编号题目"):map.get("题目编号");
        }
        if(CheckUtil.isNull(map.get("答案"))||map.get("答案").length()>10){
            throw new Exception("答案错误");
        }
        if(CheckUtil.isNull(header.get("录入时间"))||!CheckUtil.isTime(header.get("录入时间"))){
            throw new Exception("录入时间错误");
        }
        this.QuestionID = questionID;
        this.QuestionNo = header.get("试卷编码")+"_"+questionCode;
        this.InitID = initID;
        this.InitNo = initNo;
        this.IsCorrect = new Byte("1");
        this.ChoiceA = map.get("选项A");
        this.ChoiceB = map.get("选项B");
        this.ChoiceC = map.get("选项C");
        this.ChoiceD = map.get("选项D");
        this.Answer = map.get("答案");
        this.CreateTime = header.get("录入时间");
        this.CreateUser = header.get("录入人");
        this.CreateUsername = FileUtil.getMemberName(CreateUser);
        this.LastUpdTime = TimeUtil.getNow();
        this.LastUpdUser = header.get("录入人");
        this.Remark = header.get("备注");
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
