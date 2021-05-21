package com.ashraf.game.game.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;


@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		//disable csrf, authorize /authenticate, but not the others, and do do session
		http.csrf().disable().cors().configurationSource(request -> {
		      var cors = new CorsConfiguration();
		      cors.setAllowedOrigins(List.of("http://localhost:4200", "http://localhost:8080", "https://fdf-game-generator.herokuapp.com" "http://127.0.0.1:80"));
		      cors.setAllowedMethods(List.of("GET","POST", "PUT", "DELETE", "OPTIONS"));
		      cors.setAllowedHeaders(List.of("*"));
		      return cors;
		    }).and()
		.authorizeRequests().anyRequest().permitAll();
	}

	

}
