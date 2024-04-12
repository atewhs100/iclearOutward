package com.java.iclear;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class IclearOutwardApplication {

	public static void main(String[] args) {
		SpringApplication.run(IclearOutwardApplication.class, args);
	}

	/*
	 * @Bean public CorsConfigurationSource corsConfigurationSource() {
	 * CorsConfiguration configuration = new CorsConfiguration();
	 * configuration.setAllowedOrigins(Arrays.asList("https://localhost:9090"));
	 * configuration.setAllowedMethods(Arrays.asList("GET", "POST")); configuration
	 * .setAllowedHeaders(Arrays.asList("content-type", "Authorization", "Accept",
	 * "Branch", "module-name")); configuration.setAllowCredentials(Boolean.TRUE);
	 * 
	 * UrlBasedCorsConfigurationSource source = new
	 * UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
	 * configuration); return source; }
	 */
}
