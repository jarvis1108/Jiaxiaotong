
## 客户端请求消息

### 客户端请求服务端出题
``` json
{
    "msgID": "UUID()",
    "msgType": "A",
    "msgData":{
        "matchId": "战局Id",
        "no": "试题序号，从1开始"
    },
    "msgDesc": "请求出题"
}
```

### 客户端请求服务端计算本题成绩
``` json
{
    "msgID": "生成UUID",
    "msgType": "B",
    "msgData":{
        "matchId" : "战局Id",
        "correctAnswer": "本题正确答案",
        "userAnswer": "用户答案",
        "timeLeft": "剩余时间",
        "no": "试题序号，从1开始"
    },
    "msgDesc": "请求计算当前分数"
}
```

### 客户端请求服务端返回战局所有用户最终成绩
``` json
{
	"msgID": "生成UUID",
	"msgType": "F",
	"magData": {
		"matchId" : "战局Id"
	}
	"msgDesc" : "请求返回所有用户最终成绩"
}
```

## 服务端响应消息

### 战局达到最大人数，无法加入战局
``` json
{
    "msgID": "生成UUID",
    "msgType": "Z",
    "msgData":{},
    "msgDesc": "战局达到最大人数"
}
```


### 将自己信息发送给战局内的其他用户
``` json
{
    "msgID": "生成UUID",
    "msgType": "A",
    "msgData": {
        "isSuccess" : true,
        "curData": {
            "user": {
                "userId": "用户Id",
                "userNo": "用户No",
                "sex":"用户性别，1表示男，2表示女",
                "wechatName": "微信昵称",
                "city": "用户城市",
                "telephone": "用户电话",
                "headImage": "用户头像地址",
                "otherInfo": "用户其他信息",
                "coin": "用户金币数目",
                "gradePoint" :"用户绩点",
                "learningPoint": "用户学点",
                "matchSumCount": "用户匹配总场次",
                "matchWinCount": "用户匹配胜场",
                "matchLoseCount": "用户匹配输场",
                "matchDogFallCount": "用户匹配平局场次",
                "experience": "用户经验值",
                "externalLevel": "用户等级"
            },
            "matchId" : "战局ID" 
        },
        "errorInfo":{}
    },
    "msgDesc": "用户信息"
}
```

### 将战局中的其他用户信息发给自己
``` json
{
    "msgID": "生成UUID",
    "msgType": "A",
    "msgData": {
        "isSuccess" : true,
        "curData": {
            "userList": [
                {
                    "userId": "用户Id",
                    "userNo": "用户No",
                    "sex":"用户性别，1表示男，2表示女",
                    "wechatName": "微信昵称",
                    "city": "用户城市",
                    "telephone": "用户电话",
                    "headImage": "用户头像地址",
                    "otherInfo": "用户其他信息",
                    "coin": "用户金币数目",
                    "gradePoint" :"用户绩点",
                    "learningPoint": "用户学点",
                    "matchSumCount": "用户匹配总场次",
                    "matchWinCount": "用户匹配胜场",
                    "matchLoseCount": "用户匹配输场",
                    "matchDogFallCount": "用户匹配平局场次",
                    "experience": "用户经验值",
                    "externalLevel": "用户等级"
                },
                {...}
            ],
            "matchId" : "战局Id"
        },
        "errorInfo":{}
    },
    "msgDesc": "用户信息"
}

### 返回试题信息
``` json
{
    "msgID": "生成UUID",
    "msgType": "B",
    "msgData":{
        "isSuccess": true,
        "curData": {
            "question": {
                "questionId":"试题Id",
                "questionNo": "试题编号",
                "questionCode": "试题编码",
                "question" : "题干",
                "choiceA" : "选项A",
                "choiceB" : "选项B",
                "choiceC" : "选项C",
                "choiceD" : "选项D",
                "answer": "答案",
                "reference": "引用出处",
                "questionLevel": "试题等级",
                "difficulty": "难度系数",
                "coinWeight": "金币权值",
                "gpWeight": "绩点权值",
                "questionAnalyze": "试题解析",
                "knowledgeId": "知识点Id",
                "content": "知识点内容",
                "subjectId": "科目Id",
                "subjectName": "科目名称",
                "subjectShortName": "科目简称",
                "courseId": "课程Id",
                "courseName": "课程名称",
                "courseShortName": "课程简称"
            }
        },
        "errorInfo": {}
    },
    "msgDesc": "出题成功"
}
```

### 返回所有用户最终成绩
``` json
{
    "msgID": "生成UUID",
    "msgType": "E",
    "msgData":{
        "isSuccess": true,
        "curData" :{
            "matchScoreMap" : [
				{userId : score},
				{...}
            ]
        },
        "errorInfo": {}
    },
    "msgDesc": "发送给用户的成绩"
}
```

### 答题人数与在线人数不符
``` json
{
	"msgID":"生成UUID",
	"msgType":"Z",
	"msgData":{},
	"msgDesc":"答题人数与在线人数不符!"
}
```

### 通知所有用户可以请求下一题
``` json
{
	"msgID":"生成UUID",
	"msgType":"D",
	"msgData":{},
	"msgDesc":"可以请求下一题"
}