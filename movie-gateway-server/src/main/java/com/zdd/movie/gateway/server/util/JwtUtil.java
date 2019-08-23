package com.zdd.movie.gateway.server.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


/**
 * jwt 生成 验证解析工具类
 * @author zhangdandan
 */
public class JwtUtil {
    private static final String SECRET = "dhsjakdhwqu$$s78h213*";
    private static final String TOKEN_PRE = "Bear ";

    public static String generateToken(String user){
       Map<String,Object> map = new HashMap<>();
       map.put("id",new Random().nextInt());
       map.put("user",user);
       String jwt = Jwts.builder()
               .setSubject("user info")
               .setClaims(map)
               .signWith(SignatureAlgorithm.HS512,SECRET)
               .compact();
        String finalJwt = TOKEN_PRE + jwt;
        return finalJwt;
    }
}
