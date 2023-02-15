package com.usedcar.dev.security;

import com.usedcar.dev.domain.dto.Dealers;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class DealerSecurityService {
    @Value("${jwt.SECRET_KEY}")
    private String SECRET_KEY;

    @Value("${jwt.EXP_TIME}")
    private String EXP_TIME;

    public String createToken(Dealers dealers) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS512;
        byte[] secretKeyByte = DatatypeConverter.parseBase64Binary(SECRET_KEY);
        Key key = new SecretKeySpec(secretKeyByte, signatureAlgorithm.getJcaName());
        Map<String, Object> map = new HashMap<>();
        map.put("id", dealers.getId());
        map.put("name", dealers.getName());
        map.put("phoneNumber", dealers.getPhoneNumber());
        map.put("locale", dealers.getLocale());
        map.put("nickName", dealers.getNickName());
        map.put("email", dealers.getEmail());
        map.put("companyName",dealers.getCompanyName());
        map.put("position", dealers.getPosition());
        map.put("matchCount", dealers.getMatchCount());
        return Jwts.builder().setClaims(map)
                .signWith(key)
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(EXP_TIME) * 24))
                .compact();

    }
    public DealerTokenInfo parseToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(DatatypeConverter
                        .parseBase64Binary(SECRET_KEY))
                .build()
                .parseClaimsJws(token)
                .getBody();
        DealerTokenInfo info = new DealerTokenInfo().parseToken(claims);

        return info;

    }
}
