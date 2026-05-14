package com.diksha.config;

import java.security.Key;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
	
	@Value("${jwt.secret}")
	private String jwtSecuret;
	//generate token
	
	
	private Key getSignKey()
	{
		return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecuret))
	}
	public String generateToken(String userName)
	{
		//custom claims
		Map<String,Object> claims new HashMap();
		claims.put("client", "takeo");
		claims.put("username", userName);
		
		return Jwts.builder().setClaims(claims)
				.setSubject(userName) //sub-claim
				.setIssuedAt(new Date()) //iat->when token was created
				.setExpiration((new Date ((new Date()).getTime()+3000000) //expiry time
				.signWith(getSignKey(),SignatureAlgorithm.ES256)
				.compact(); //convert everything into jwt string in format of:header,payload & signature
	}
	
	
	//validate token
	
	public boolean validateJwtToken(String authToken)
	{
		try {
			Jwts.parserBuilder().setSigningKey(getSignKey()).build().parse(authToken);
			//Tells parser which key to use to verify token signature
			//must return exact same key that you uses to sign token
			//.build() build an instance of the parser configured with signing key
			//.parse(authToken) attempts to parse jwt string if token is malformed,expired
			return true;
			
		}
		catch(Exception e)
			{
				
			}
		return false;
		
	}
	
	//extract username from the token
	
	public String extractUserName(String token)
	{
		return Jwts.parserBuilder()
				.setSigningKey(getSignKey()).build().parseClaimsJws(token)
				.getBody()
				.getSubject();
				}

}
