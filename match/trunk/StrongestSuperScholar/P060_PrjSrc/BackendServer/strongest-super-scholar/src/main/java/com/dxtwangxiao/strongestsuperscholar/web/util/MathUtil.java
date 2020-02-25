package com.dxtwangxiao.strongestsuperscholar.web.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 数学工具类
 * <p>
 * Created By Devin
 * 2018-09-07 上午 11:26
 */
public class MathUtil {

    /**
     * 生成不重复的随机数
     *
     * @param max    最大值
     * @param number 生成的随机数数目
     * @return 随机数列表
     */
    public static List<Integer> randomNumbers(long max, int number) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        while (i < number) {
            int num = (int) (Math.random() * max);
            if (result.contains(num)) {
                continue;
            } else {
                result.add(num);
            }
            i++;
        }

        return result;
    }
}
