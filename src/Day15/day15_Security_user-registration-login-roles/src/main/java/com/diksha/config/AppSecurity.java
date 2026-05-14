package com.diksha.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.diksha.filter.JWTAuthFilter;
import com.diksha.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class AppSecurity {

	@Autowired
	private JWTAuthFilter jwtAuthFilter;
	@Bean
	PasswordEncoder passwordEncoder() 
	{
		return new BCryptPasswordEncoder();
	}
	
	//we are not required to configure in springBoot 3.x onward
	
	@Bean
	UserDetailsService userDetailsService()
	{
		return new UserDetailsServiceImpl;
	}
	
	@Bean
	AuthenticationManager authenticationManager(AuthenticationConfiguration config)throws Exception
	{
		return config.getAuthenticationManager();
	}
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		http.csrf(obj->obj.disable())
			.authorizeHttpRequests(authorize->
					authorize.requestMatchers("/normal").hasAnyRole("USER")
					.requestMatchers("/admin").hasAnyRole("ADMIN")
					.requestMatchers("/public","/api/v1/users").permitAll()
					)
			.sessionManagement(session->session.ses)
		
		return http.build();
	}
}
