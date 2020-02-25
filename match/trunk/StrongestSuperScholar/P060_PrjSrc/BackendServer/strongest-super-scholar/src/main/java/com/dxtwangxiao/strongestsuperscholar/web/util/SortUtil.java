package com.dxtwangxiao.strongestsuperscholar.web.util;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 排序工具类
 * <p>
 * Created by Devin
 * 2018-10-10 上午 11:22
 */
public class SortUtil {

    /**
     * 针对群PK中的分数进行排序
     *
     * @param scoreMap 待排序的map
     * @return 排序后的map
     */
    public static Map<String, Integer> scoreSort(Map<String, Integer> scoreMap) {
        Map<String, Integer> result = new TreeMap<String, Integer>(new MapValueComparator<Integer>(scoreMap));
        result.putAll(scoreMap);

        return result;
    }
}

class MapValueComparator<T extends Comparable<T>> implements Comparator<String> {
    private Map<String, T> map = null;

    public MapValueComparator(Map<String, T> map) {
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        int r = map.get(o2).compareTo(map.get(o1));
        if (r == 0) return 1; // 不这样写，值相同的会被删掉；但是这样写，get会返回null。看自己的需求写吧。
        return r;
    }
}
