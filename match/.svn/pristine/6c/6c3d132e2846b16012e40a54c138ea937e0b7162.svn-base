package util;

import java.util.regex.Pattern;

/**
 * @author miaoyu
 * @date 2018/7/19 16:50
 */
public class CheckUtil {
    /**
     * 是否是空字符串
     * @param toCheck
     * @return
     */
    public static boolean isNull(String toCheck){
        return toCheck == null || "".equals(toCheck.trim());
    }

    /**
     * 是否是一个(0,1)的最多两位小数的浮点数
     * @param toCheck
     * @return
     */
    public static boolean isFLoatUnderOne(String toCheck){
        String regex = "0.[0-9]{1,4}|1|1.[0]{0,4}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(toCheck.trim()).matches();
    }

    /**
     * 是否是一个录题组成员编号
     * @param toCheck
     * @return
     */
    public static boolean isMemberCode(String toCheck){
        String regex = "100|0[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(toCheck.trim()).matches();
    }

    /**
     * 是否是一个版本号
     * @param toCheck
     * @return
     */
    public static boolean isVersionCode(String toCheck){
        String regex = "V[1-9][0-9]?.[0-9]{1,2}";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(toCheck.trim()).matches();
    }

    /**
     * 是否是试题编号
     * @param toCheck
     * @return
     */
    public static boolean isQuestionNo(String toCheck){
        String regex = "[0-9]+";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(toCheck.trim()).matches();
    }

    /**
     * 是否是单选题答案
     * @param toCheck
     * @return
     */
    public static boolean isMultipleChoiceAnswer(String toCheck){
        String regex = "A|B|C|D";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(toCheck.trim()).matches();
    }

    public static boolean isTime(String toCheck){
        String regex = "^[1-9]\\d{3}-(0?[1-9]|1[0-2])-(0?[1-9]|[1-2][0-9]|3[0-1])\\s+(20|21|22|23|0?\\d|1\\d):(0?\\d|[1-5]\\d):(0?\\d|[1-5]\\d)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(toCheck.trim()).matches();
    }

}
