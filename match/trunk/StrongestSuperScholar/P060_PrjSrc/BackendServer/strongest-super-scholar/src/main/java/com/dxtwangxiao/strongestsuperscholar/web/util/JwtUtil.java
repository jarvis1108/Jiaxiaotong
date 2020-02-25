package com.dxtwangxiao.strongestsuperscholar.web.util;

import com.dxtwangxiao.strongestsuperscholar.web.error.CommonError;
import com.dxtwangxiao.strongestsuperscholar.web.error.StrongestScholarException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * JWT工具类
 * <p>
 * Created By Devin
 * 2018-09-30 下午 04:58
 */
public class JwtUtil {
    private static final String SECRET = "a970f0b4c82c4dc69b2834fffe7bcc4b";

    /**
     * 根据用户id和openid生成JWT
     *
     * @param userId 用户Id
     * @param openid openid
     * @return JWT
     */
    public static String generateToken(String userId, String openid) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("openid", openid);

        String token = Jwts.builder()
                .setClaims(map)
                .setExpiration(new Date(System.currentTimeMillis() + 2 * 3600 * 1000L))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        return "Bearer;" + token;
    }

    /**
     * 验证token
     *
     * @param token 待验证token
     */
    public static void validateToken(String token) {
        try {
            Map<String, Object> body = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace("Bearer;", ""))
                    .getBody();
        } catch (Exception e) {
            throw new StrongestScholarException(CommonError.TOKEN_ERROR);
        }
    }
}
