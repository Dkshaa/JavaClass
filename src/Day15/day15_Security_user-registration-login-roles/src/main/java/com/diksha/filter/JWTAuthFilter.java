package com.diksha.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.diksha.config.JWTService;
import com.diksha.service.UserDetailsServiceImpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTAuthFilter extends OncePerRequestFilter {

	@Autowired
	private JWTService jwtService;
	
	@Autowired
	private UserDetailsServiceImpl userService;
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//parse Jwt
		
		String jwtToken =null;
		String headerAuth=request.getHeader("Authorization");
		if(StringUtils.hasText(headerAuth) && headerAuth.startsWith("Bearer"))
		{
			jwtToken = headerAuth.substring(7);
		}
		
		if(jwtToken !=null && jwtService.validateJwtToken(jwtToken))
		{
			//from the token extract username
			String userName = jwtService.extractUserName(jwtToken);
			
			UserDetails userDetails = userService.loadUserByUsername(userName);
			var usernamepwToken=new UsernamePasswordAuthenticationToken(userDetails.getUsername(),userDetails.getPassword());
			
			SecurityContextHolder.getContext().setAuthentication(usernamepwToken);
		}
		filterChain.doFilter(request, response);

	}

}
