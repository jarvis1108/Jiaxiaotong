package com.dxtwangxiao.strongestsuperscholar.web.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


/**
 * 加密解密工具类
 * <p>
 * Created by Devin
 * 2018-06-20 上午 10:00
 */
public class EncryptUtil {
    /**
     * AES加密
     *
     * @param str           待加密字符串
     * @param secretKeyBase 用于生成秘钥的基础字符串
     * @return 加密后的字节数组
     */
    public static byte[] encryptAES(String str, String secretKeyBase) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom(secretKeyBase.getBytes()));

            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(encodeFormat, "AES");

            Cipher cipher = Cipher.getInstance("AES"); // 创建密码器
            byte[] byteContent = str.getBytes("UTF-8");
            cipher.init(Cipher.ENCRYPT_MODE, key);

            return cipher.doFinal(byteContent); // 加密返回

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * AES解密
     *
     * @param strByteArray  待解密字节数组
     * @param secretKeyBase 用于生成密钥的基础字符串， 需要注意的是EAS是对称加密，所以secretKeyBase在加密解密时要一样的
     * @return 解密后的字符串
     */
    public static String decryptAES(byte[] strByteArray, String secretKeyBase) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom(secretKeyBase.getBytes()));

            SecretKey secretKey = keyGenerator.generateKey();
            byte[] encodeContent = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(encodeContent, "AES");

            Cipher cipher = Cipher.getInstance("AES"); //创建密码器
            cipher.init(Cipher.DECRYPT_MODE, key); // 初始化

            return new String(cipher.doFinal(strByteArray), "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * SHA、SHA1加密
     *
     * @param str 待加密字符串
     * @return 加密后的字符串
     */
    public static String SHA1(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1"); //如果是SHA加密只需要将"SHA-1"改成"SHA"即可
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexStr = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (byte aMessageDigest : messageDigest) {
                String shaHex = Integer.toHexString(aMessageDigest & 0xFF);
                if (shaHex.length() < 2) {
                    hexStr.append(0);
                }
                hexStr.append(shaHex);
            }
            return hexStr.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * MD5加密，返回加密后的字符串
     *
     * @param str 待加密字符串
     * @return 加密后的字符串
     */
    public static String MD5(String str) {
        try {
            // 1.获取MD5摘要算法的 MessageDigest 对象
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");

            // 2.使用指定的字节更新摘要
            messageDigest.update(str.getBytes());

            // 3.获得密文
            byte[] md = messageDigest.digest();

            // 4.把密文转换成十六进制的字符串形式
            StringBuffer hexString = new StringBuffer();

            // 5. 将字节数组转换为十六进制数
            for (byte aMd : md) {
                String shaHex = Integer.toHexString(aMd & 0Xff);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * MD5加密，返回加密后的字节数组
     *
     * @param str 待加密字符出纳
     * @return 加密后的字节数组
     */
    public static byte[] MD5ToByteArray(String str) {
        try {
            // 1.获取MD5摘要算法的 MessageDigest 对象
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");

            // 2.使用指定的字节更新摘要
            messageDigest.update(str.getBytes());

            // 3.获得密文
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * MD5加密，返回加密后的字节数组
     *
     * @param contentBytes 字节数组
     * @return
     */
    public static String md5Hex(byte[] contentBytes) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(contentBytes);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
