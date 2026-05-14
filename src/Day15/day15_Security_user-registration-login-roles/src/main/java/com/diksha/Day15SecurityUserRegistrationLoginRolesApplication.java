package com.diksha;

import java.util.Base64;

import javax.crypto.SecretKey;
import io.jsonwebtoken.security.Keys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day15SecurityUserRegistrationLoginRolesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day15SecurityUserRegistrationLoginRolesApplication.class, args);
		
		SecretKey key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS256) ;//generate random key
	
		String base64Key = Base64.getEncoder().encodeToString(key.getEncoded());
		System.out.println("Jwt secret key : "+base64Key);
	}

}
