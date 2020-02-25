package com.dxtwangxiao.strongestsuperscholar.web.util;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

/**
 * 对象属性拷贝，忽略空值
 * <p>
 * Created by Devin
 * 2018-06-15 下午 01:55
 */
public class UpdateUtil {

    /**
     * 将非空值的属性从源实体类中更新到目标实体类中
     *
     * @param src    要将属性中的空值覆盖的对象(源实体类)
     * @param target 从数据库根据id查询出来的目标对象
     */
    public static void copyProperties(Object src, Object target) {
        BeanUtils.copyProperties(src, target, getNullProperties(src));
    }

    /**
     * 将为空的properties给找出来,然后返回出来
     *
     * @param src
     * @return
     */
    private static String[] getNullProperties(Object src) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(src);
        PropertyDescriptor[] descriptors = beanWrapper.getPropertyDescriptors();

        Set<String> emptyName = new HashSet<>();
        for (PropertyDescriptor descriptor : descriptors) {
            Object value = beanWrapper.getPropertyValue(descriptor.getName());
            if (value == null) {
                emptyName.add(descriptor.getName());
            }
        }

        String[] result = new String[emptyName.size()];
        return emptyName.toArray(result);
    }
}
