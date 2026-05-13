package com.diksha.config;

import java.beans.Customizer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@EnableAutoConfiguration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilter (HttpSecurity http)
	{
		http.authorizeHttpRequests(auth->
		
		auth.requestMatchers("/admin/**")
		
		.hasRole("Admin")
		
		.requestMatchers("/use/**").hasAnyRole("USER","ADMIN")
		
		.anyRequest().authenticated()
		)
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
	
	return http.build();
}
}

