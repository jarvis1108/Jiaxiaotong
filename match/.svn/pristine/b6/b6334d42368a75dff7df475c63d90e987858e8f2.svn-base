package com.dxtwangxiao.strongestsuperscholar.web.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * <p>
 * Created by Devin
 * 2018-06-19 下午 05:00
 */
public class DateUtil {

    /**
     * 获取当前时间戳（秒）
     *
     * @return 当前时间戳（秒）
     */
    public static Long getCurrentTimeStamp() {
        return System.currentTimeMillis() / 1000;
    }

    /**
     * 将日期转换成时间戳（秒）
     *
     * @param date 日期（Date类型）
     * @return 时间戳（Long类型）
     */
    public static Long dateToStamp(Date date) {
        if (date == null) {
            return 0L;
        }
        String timestamp = String.valueOf(date.getTime() / 1000);
        return Long.parseLong(timestamp);
    }

    /**
     * 将时间戳（秒）转换为日期
     *
     * @param timestamp 时间戳（秒，Long类型）
     * @return 日期（String类型，格式为：yyyy-MM-dd HH:mm:ss）
     */
    public static String stampToDate(Long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long ls = timestamp * 1000;
        Date date = new Date(ls);

        return sdf.format(date);
    }

    /**
     * 获取当前时间，格式为年月日时分
     *
     * @return
     */
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        return sdf.format(new Date());
    }
}
