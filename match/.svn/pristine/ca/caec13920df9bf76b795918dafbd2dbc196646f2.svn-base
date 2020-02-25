package entity;

import util.CheckUtil;
import util.FileUtil;
import util.TimeUtil;

import java.util.Date;
import java.util.Map;

/**
 * @author miaoyu
 * @date 2018/7/4 10:00
 */
public class QuestionManual {
    private String QuestionID;
    private String QuestionNo;
    private String InitID;
    private String InitNo;
    private Byte IsCorrect;
    private String ErrorReason;
    private String ExaminationCode;
    private String ExaminationDes;
    private String ExaminationTitle;
    private String ExaminationSummary;
    private String ExaminationVersion;
    private String QuestionCode;
    private String QuestionType;
    private String KnowledgeDes;
    private String Question;
    private String Provider;
    private String PersonInCharge;
    private String GradeName;
    private String SubjectName;
    private String Reference;
    private Integer QuestionLevel;
    private Double Difficulty;
    private Double CoinWeight;
    private Double GPWeight;
    private String QuestionAnalyze;
    private Integer RecommendTime;
    private String CreateTime;
    private String CreateUser;
    private String CreateUsername;
    private String LastUpdTime;
    private String LastUpdUser;
    private Integer PrsStatus;
    private String PrsUserId;
    private String PrsUsername;
    private String PrsTime;
    private String IsCheckPass;
    private String CheckUserId;
    private String CheckUsername;
    private String CheckTime;
    private Byte IsValid;
    private String Remark;

    public QuestionManual(Map<String,String> header,Map<String,String> question,String questionID,String initID,String initNo) throws Exception {
        String now = TimeUtil.getNow();
        String questionCode;
        if(CheckUtil.isNull(header.get("试卷编码"))){
            throw new Exception("试卷编码为空");
        }
        if(CheckUtil.isNull(question.get("题目编号"))&&CheckUtil.isNull(question.get("编号题目"))){
            throw new Exception("题目编号为空");
        }else {
            questionCode = question.get("题目编号")==null?question.get("编号题目"):question.get("题目编号");
        }
        if(CheckUtil.isNull( header.get("版本号"))){
            throw new Exception("版本号为空");
        }
        if(!CheckUtil.isNull(question.get("难度系数"))&&!CheckUtil.isFLoatUnderOne(question.get("难度系数"))){
            throw new Exception("难度系数错误");
        }
        if(CheckUtil.isNull(question.get("题干"))){
            throw new Exception("题干为空");
        }
        if(CheckUtil.isNull(question.get("知识点"))){
            throw new Exception("知识点为空");
        }
        if(CheckUtil.isNull(question.get("年级"))&&CheckUtil.isNull(question.get("年级_"))){
            throw new Exception("年级为空");
        }
        if(CheckUtil.isNull(question.get("科目"))){
            throw new Exception("科目为空");
        }
        if(CheckUtil.isNull(header.get("录入时间"))||!CheckUtil.isTime(header.get("录入时间"))){
            throw new Exception("录入时间错误");
        }
        this.QuestionID = questionID;
        this.QuestionNo = header.get("试卷编码")+"_"+questionCode;
        this.InitID = initID;
        this.InitNo = initNo;
        this.IsCorrect = new Byte("1");
        this.ErrorReason = null;
        this.ExaminationCode = header.get("试卷编码");
        this.ExaminationDes = header.get("试卷名");
        this.ExaminationTitle = header.get("试卷标题");
        this.ExaminationSummary = header.get("描述说明");
        this.ExaminationVersion = header.get("版本号");
        this.QuestionCode = questionCode;
        this.QuestionType = question.get("题目类型");
        this.KnowledgeDes = question.get("知识点");
        this.Question = question.get("题干");
        this.Provider = null;
        this.PersonInCharge = null;
        this.GradeName = question.get("年级") == null?question.get("年级_"):question.get("年级");
        this.SubjectName = question.get("科目");
        this.Reference = null;
        this.QuestionLevel = null;
        this.Difficulty = CheckUtil.isNull(question.get("难度系数"))?null:Double.valueOf(question.get("难度系数"));
        this.CoinWeight = null;
        this.GPWeight = null;
        this.QuestionAnalyze = question.get("解析");
        this.RecommendTime = null;
        this.CreateTime = header.get("录入时间");
        this.CreateUser = header.get("录入人");
        this.CreateUsername = FileUtil.getMemberName(header.get("录入人"));
        this.LastUpdTime = now;
        this.LastUpdUser = header.get("录入人");
        this.PrsStatus = 0;
        this.PrsUserId = null;
        this.PrsUsername = null;
        this.PrsTime = null;
        this.IsCheckPass = "0";
        this.CheckUserId = null;
        this.CheckUsername = null;
        this.CheckTime = null;
        this.IsValid = new Byte("1");
        this.Remark = header.get("备注");
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

    public String getErrorReason() {
        return ErrorReason;
    }

    public void setErrorReason(String errorReason) {
        ErrorReason = errorReason;
    }

    public String getExaminationCode() {
        return ExaminationCode;
    }

    public void setExaminationCode(String examinationCode) {
        ExaminationCode = examinationCode;
    }

    public String getExaminationDes() {
        return ExaminationDes;
    }

    public void setExaminationDes(String examinationDes) {
        ExaminationDes = examinationDes;
    }

    public String getExaminationTitle() {
        return ExaminationTitle;
    }

    public void setExaminationTitle(String examinationTitle) {
        ExaminationTitle = examinationTitle;
    }

    public String getExaminationSummary() {
        return ExaminationSummary;
    }

    public void setExaminationSummary(String examinationSummary) {
        ExaminationSummary = examinationSummary;
    }

    public String getExaminationVersion() {
        return ExaminationVersion;
    }

    public void setExaminationVersion(String examinationVersion) {
        ExaminationVersion = examinationVersion;
    }

    public String getQuestionCode() {
        return QuestionCode;
    }

    public void setQuestionCode(String questionCode) {
        QuestionCode = questionCode;
    }

    public String getQuestionType() {
        return QuestionType;
    }

    public void setQuestionType(String questionType) {
        QuestionType = questionType;
    }

    public String getKnowledgeDes() {
        return KnowledgeDes;
    }

    public void setKnowledgeDes(String knowledgeDes) {
        KnowledgeDes = knowledgeDes;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getProvider() {
        return Provider;
    }

    public void setProvider(String provider) {
        Provider = provider;
    }

    public String getPersonInCharge() {
        return PersonInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        PersonInCharge = personInCharge;
    }

    public String getGradeName() {
        return GradeName;
    }

    public void setGradeName(String gradeName) {
        GradeName = gradeName;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public Integer getQuestionLevel() {
        return QuestionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        QuestionLevel = questionLevel;
    }

    public Double getDifficulty() {
        return Difficulty;
    }

    public void setDifficulty(Double difficulty) {
        Difficulty = difficulty;
    }

    public Double getCoinWeight() {
        return CoinWeight;
    }

    public void setCoinWeight(Double coinWeight) {
        CoinWeight = coinWeight;
    }

    public Double getGPWeight() {
        return GPWeight;
    }

    public void setGPWeight(Double GPWeight) {
        this.GPWeight = GPWeight;
    }

    public String getQuestionAnalyze() {
        return QuestionAnalyze;
    }

    public void setQuestionAnalyze(String questionAnalyze) {
        QuestionAnalyze = questionAnalyze;
    }

    public Integer getRecommendTime() {
        return RecommendTime;
    }

    public void setRecommendTime(Integer recommendTime) {
        RecommendTime = recommendTime;
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

    public Integer getPrsStatus() {
        return PrsStatus;
    }

    public void setPrsStatus(Integer prsStatus) {
        PrsStatus = prsStatus;
    }

    public String getPrsUserId() {
        return PrsUserId;
    }

    public void setPrsUserId(String prsUserId) {
        PrsUserId = prsUserId;
    }

    public String getPrsUsername() {
        return PrsUsername;
    }

    public void setPrsUsername(String prsUsername) {
        PrsUsername = prsUsername;
    }

    public String getPrsTime() {
        return PrsTime;
    }

    public void setPrsTime(String prsTime) {
        PrsTime = prsTime;
    }

    public String getIsCheckPass() {
        return IsCheckPass;
    }

    public void setIsCheckPass(String isCheckPass) {
        IsCheckPass = isCheckPass;
    }

    public String getCheckUserId() {
        return CheckUserId;
    }

    public void setCheckUserId(String checkUserId) {
        CheckUserId = checkUserId;
    }

    public String getCheckUsername() {
        return CheckUsername;
    }

    public void setCheckUsername(String checkUsername) {
        CheckUsername = checkUsername;
    }

    public String getCheckTime() {
        return CheckTime;
    }

    public void setCheckTime(String checkTime) {
        CheckTime = checkTime;
    }

    public Byte getIsValid() {
        return IsValid;
    }

    public void setIsValid(Byte isValid) {
        IsValid = isValid;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
