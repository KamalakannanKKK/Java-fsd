package com.example.adminlogin;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import com.example.bean.Adminuser;

import java.nio.file.AccessDeniedException;
import java.util.Date;

@Component
public class JwtUtils {

    private static String secret = "This_is_secret";
    private static long expiryDuration = 60 * 60;

    public String generateJwt(Adminuser user){

        long milliTime = System.currentTimeMillis();
        long expiryTime = milliTime + expiryDuration * 1000;

        Date issuedAt = new Date(milliTime);
        Date expiryAt = new Date(expiryTime);

        // claims
        Claims claims = Jwts.claims()
                .setIssuer(user.getId().toString())
                .setIssuedAt(issuedAt)
                .setExpiration(expiryAt);

        // optional claims
        
        claims.put("name", user.getName());
        claims.put("emailId", user.getEmailId());

        // generate jwt using claims
        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    public Claims verify(String authorization) throws Exception {

        try {
            Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(authorization).getBody();
            return claims;
        } catch(Exception e) {
        	throw new AccessDeniedException("Access Denied");
        }

    }
}
