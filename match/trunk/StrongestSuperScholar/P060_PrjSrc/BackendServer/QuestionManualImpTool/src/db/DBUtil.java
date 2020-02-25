package db;

import entity.QuestionManual;
import entity.QuestionMultipleChoiceManual;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.List;


/**
 * @author miaoyu
 * @date 2018/7/3 09:41
 */
public class DBUtil {
    private static Connection connection;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "strongestscholar";
    private static final String psw = "strongestscholar";
    private static final String url = "jdbc:mysql://139.199.15.124:3306/QuestionBankManualDvlp?characterEncoding=utf8";
    static {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,user,psw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 存储一个对象
     * @param object 要存储的对象
     * @throws Exception
     */
    public static void save(Object object) throws Exception {
        PreparedStatement ps;
        String sql = getInsertSql(object.getClass());
        ps = connection.prepareStatement(sql);
        assignPreparedStatement(ps,object);
        ps.execute();
    }

    public static boolean checkQuestionManualExist(QuestionManual questionManual)throws  Exception{
        String sql = "SELECT * FROM t_ITN_QuestionManual WHERE QuestionNo = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setObject(1,questionManual.getQuestionNo());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static boolean checkQuestionMultipleChoiceManualExist(QuestionMultipleChoiceManual questionMultipleChoiceManual)throws  Exception{
        String sql = "SELECT * FROM t_ITN_QuestionMultipleChoiceManual WHERE QuestionNo = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setObject(1,questionMultipleChoiceManual.getQuestionNo());
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static boolean checkExaminationCodeExist(String code)throws  Exception{
        String sql = "SELECT * FROM t_ITN_QuestionManual WHERE ExaminationCode = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setObject(1,code);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static void saveQuestion(QuestionManual questionManual, QuestionMultipleChoiceManual questionMultipleChoiceManual) throws Exception{
        PreparedStatement ps;
        String sql;
        try{
            //开始事务
            connection.setAutoCommit(false);
            //存QuestionManual
            sql = getInsertSql(QuestionManual.class);
            ps = connection.prepareStatement(sql);
            assignPreparedStatement(ps,questionManual);
            ps.executeUpdate();

            //存储QuestionMultipleChoiceManual
            sql = getInsertSql(QuestionMultipleChoiceManual.class);
            ps= connection.prepareStatement(sql);
            assignPreparedStatement(ps,questionMultipleChoiceManual);
            ps.executeUpdate();
            //事务提交
            connection.commit();
            connection.setAutoCommit(true);
        }catch (Exception e){
            connection.rollback();
            connection.setAutoCommit(true);
            throw e;
        }

    }

    /**
     * 向主表存储记录
     * @param uuid 导入id
     * @param remark 备注
     */
    public static void executeSave(String uuid,String initUserCode,String initUserName,String initName,String initDes,String remark) throws Exception {

        String mainSql = "INSERT INTO t_ITN_MainManual VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement=null;
        Timestamp now = new Timestamp(System.currentTimeMillis());
        try{
            //开始事务
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(mainSql);
            preparedStatement.setObject(1,uuid);
            preparedStatement.setObject(2,uuid);
            preparedStatement.setObject(3,initUserCode);
            preparedStatement.setObject(4,initUserName);
            preparedStatement.setObject(5,initName);
            preparedStatement.setObject(6,initDes);
            preparedStatement.setObject(7,now);
            preparedStatement.setObject(8,remark);
            preparedStatement.setObject(9,0);
            preparedStatement.setObject(10,now);
            preparedStatement.setObject(11,now);
            preparedStatement.executeUpdate();
            //事务提交
            connection.commit();
            connection.setAutoCommit(true);
        }catch (Exception e){
            e.printStackTrace();
            connection.rollback();
            throw e;
        }

    }


    /**
     * 批量存储
     * @param list 要存储的对象序列
     */
    public static void batchSave(List<?> list) throws Exception {
        if(list == null || list.isEmpty()){
            return;
        }
        Class c = list.get(0).getClass();
        Field[] fields = c.getDeclaredFields();
        String sql = getInsertSql(c);


        PreparedStatement preparedStatement=null;
        try {
            //开始事务
            connection.setAutoCommit(false);
            //向对应表中插入记录
            preparedStatement=connection.prepareStatement(sql);
            for(int i=1;i<=list.size();i++){
                assignPreparedStatement(preparedStatement,list.get(i-1));
                //批处理
                preparedStatement.addBatch();
                //每执行五百条数据操作执行一次批处理，并且将批处理清空
                if((i%500==0)){
                    preparedStatement.executeBatch();
                    preparedStatement.clearBatch();
                }
            }
            //将最后剩余的数据操作进行处理
            preparedStatement.executeBatch();
            preparedStatement.clearBatch();

            //事务提交
            connection.commit();
            connection.setAutoCommit(true);
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw e;
        }
    }

    /**
     * 获取对某类对象执行插入操作的SQL
     * @param c 插入对象的类
     * @return
     */
    private static String getInsertSql(Class c){
        StringBuffer sb = new StringBuffer();
        sb.append("INSERT INTO t_ITN_");
        sb.append(c.getSimpleName());
        sb.append('(');
        Field[] fields = c.getDeclaredFields();
        //表的列名
        for(int j = 0;j<fields.length;j++){
            sb.append(fields[j].getName());
            if(j<fields.length-1){
                sb.append(',');
            }
        }
        sb.append(") VALUES(");


        for (int i = 0; i < fields.length; i++) {
            sb.append('?');
            if(i<fields.length-1){
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /**
     * 将PreparedStatement赋值
     * @param ps
     * @param o
     * @throws Exception
     */
    private static void assignPreparedStatement(PreparedStatement ps,Object o) throws Exception {
        Field[] fields = o.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            Object param = fields[i].get(o);
            ps.setObject(i+1,param);
            fields[i].setAccessible(false);
        }
    }
}
