package com.dxtwangxiao.strongestsuperscholar.web.util;

import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.*;

/**
 * Created By Devin
 * 2018-09-02 上午 09:18
 */
public class WechatUtil {

    /**
     * 把字符串最后拼接上key，再进行MD5运算，再将得到的字符串所有字符转换为大写，得到sign
     *
     * @param text          需要签名的字符串
     * @param key           密钥
     * @param input_charset 编码格式
     * @return
     */
    public static String sign(String text, String key, String input_charset) {
        String sign = text + "&key=" + key;
        return EncryptUtil.md5Hex(getContentBytes(sign, input_charset));
    }

    /**
     * 除去数组中的空值和签名参数
     *
     * @param sArray 签名参数组
     * @return 去掉空值与签名参数后的新签名参数组
     */
    public static Map<String, String> paraFilter(Map<String, String> sArray) {
        Map<String, String> result = new HashMap<>();
        if (sArray == null || sArray.size() <= 0) {
            return result;
        }
        for (String key : sArray.keySet()) {
            String value = sArray.get(key);
            if (value == null || value.equals("") || key.equalsIgnoreCase("sign")
                    || key.equalsIgnoreCase("sign_type")) {
                continue;
            }
            result.put(key, value);
        }
        return result;
    }

    /**
     * 签名字符串
     *
     * @param text          需要签名的字符串
     * @param sign          签名结果
     * @param key           密钥
     * @param input_charset 编码格式
     * @return
     */
    public static boolean verify(String text, String sign, String key, String input_charset) {
        text = text + key;
        String mySign = EncryptUtil.md5Hex(getContentBytes(text, input_charset));
        return mySign.equals(sign);
    }

    /**
     * 发起http请求
     *
     * @param requestUrl    请求地址
     * @param requestMethod 请求方法
     * @param outputStr     参数
     * @return
     */
    public static String httpRequest(String requestUrl, String requestMethod, String outputStr) {
        StringBuffer buffer = null;
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod(requestMethod);
            conn.setDoInput(true);
            conn.setDoOutput(true);

            // 向服务器端写内容
            if (null != outputStr) {
                OutputStream os = conn.getOutputStream();
                os.write(outputStr.getBytes(StandardCharsets.UTF_8));
                os.close();
            }

            // 读取服务器端返回的内容
            InputStream is = conn.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            buffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                buffer.append(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }


    /**
     * 提交post请求, 带xml参数, 需要验证证书
     *
     * @param requestUrl   请求URL
     * @param certLocation 证书地址
     * @param xmlInfo      参数信息
     * @return 返回的结果信息
     */
    public static String postRequestWithCert(String requestUrl, String certLocation, String xmlInfo, String mchId) throws Exception {
        // 加载证书
        FileInputStream inputStream = null;
        KeyStore keyStore = null;
        try {
            keyStore = KeyStore.getInstance("PKCS12");
            inputStream = new FileInputStream(new File(certLocation));
            keyStore.load(inputStream, mchId.toCharArray());
            inputStream.close();
        } catch (KeyStoreException e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "生成KeyStore实例出错!");
        } catch (FileNotFoundException e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "商户证书不存在!");
        } catch (IOException e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "流错误!");
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.INNER_ERR.getCode(), "证书加载错误!");
        }

        SSLContext sslContext = SSLContexts.custom().loadKeyMaterial(keyStore, mchId.toCharArray()).build();
        SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, new String[]{"TLSv1"}, null, SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);

        //发送请求
        HttpPost post = new HttpPost();
        post.addHeader("Content-Type", "text/xml");
        post.setEntity(new StringEntity(xmlInfo, "UTF-8"));

        CloseableHttpResponse response = HttpClients.custom().setSSLSocketFactory(sslConnectionSocketFactory)
                .build().execute(post);

        //返回响应
        return EntityUtils.toString(response.getEntity(), "utf-8");
    }

    /**
     * 解析xml,返回第一级元素键值对。如果第一级元素有子节点，则此节点的值是子节点的xml数据
     *
     * @param xmlStr xml字符串
     * @return
     * @throws Exception
     */
    public static Map doXmlParse(String xmlStr) throws StrongestScholarException {
        if (xmlStr == null || xmlStr.equals("")) {
            return null;
        }

        try {
            Map map = new HashMap();
            InputStream is = string2InputStream(xmlStr);
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(is);
            Element root = doc.getRootElement();

            List list = root.getChildren();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Element element = (Element) iterator.next();
                String key = element.getName();
                String value = "";
                List children = element.getChildren();
                if (children.isEmpty()) {
                    value = element.getTextNormalize();
                } else {
                    value = getChildrenText(children);
                }
                map.put(key, value);
            }
            is.close();
            return map;
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.XML_PARSE_ERR.getCode(), CommonError.XML_PARSE_ERR.getCode());
        }
    }

    /**
     * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     *
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, String> params) {
        List<String> keys = new ArrayList<>(params.keySet());
        Collections.sort(keys);
        String prestr = "";
        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);
            if (i == keys.size() - 1) {// 拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }
        return prestr;
    }

    private static byte[] getContentBytes(String content, String charset) {
        if (charset == null || charset.equals("")) {
            return content.getBytes();
        }

        try {
            return content.getBytes(charset);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("MD5签名过程中出现错误，指定的编码集不对，您目前指定的编码集是：" + charset);
        }
    }

    private static String getChildrenText(List children) {
        StringBuilder sb = new StringBuilder();
        if (!children.isEmpty()) {
            Iterator it = children.iterator();
            while (it.hasNext()) {
                Element e = (Element) it.next();
                String name = e.getName();
                String value = e.getTextNormalize();
                List list = e.getChildren();
                sb.append("<").append(name).append(">");
                if (!list.isEmpty()) {
                    sb.append(getChildrenText(list));
                }
                sb.append(value);
                sb.append("</").append(name).append(">");
            }
        }

        return sb.toString();
    }

    private static InputStream string2InputStream(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }
}