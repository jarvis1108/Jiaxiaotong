package com.dxtwangxiao.questionchecktool.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

/**
 * Created by Devin
 * 2018-07-13 上午 10:59
 */
public class PersonUtil {

    public static String getNameByCode(String code) {
        String personJson = getPersonConfig();
        JSONArray jsonArray = JSON.parseArray(personJson);

        for (Iterator iterator = jsonArray.iterator(); iterator.hasNext(); ) {
            JSONObject jsonObject = (JSONObject) iterator.next();
            if (jsonObject.getString("code").equals(code)) {
                return jsonObject.getString("name");
            }
        }
        return null;
    }

    private static String getPersonConfig() {

        String data = "";
        ClassPathResource classPathResource = new ClassPathResource("person-config.json");
        try {
            byte[] bData = FileCopyUtils.copyToByteArray(classPathResource.getInputStream());
            data = new String(bData, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}

