package com.rift.realtyinsights.forclosureapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig implements WebMvcConfigurer{
			
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Map the specific path you want to allow CORS for
            .allowedOrigins("*") // Replace with your client's origin
            //.allowedMethods("GET", "POST", "PUT", "DELETE")
            .allowedMethods("GET")
            .allowedHeaders("*");
    }
	
	
}
