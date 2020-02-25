package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author miaoyu
 * @date 2018/7/19 14:37
 */
public class TimeUtil {
    public static String getNow(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
