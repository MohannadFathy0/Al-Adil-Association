package com.backend.AlAdil.Association;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Specify the mapping path(s) you want to allow CORS for
                .allowedOrigins("http://localhost:3000")  // Specify the origin allowed to access the resource
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify the HTTP methods allowed
                .allowedHeaders("*");  // Specify the HTTP headers allowed
    }
}
