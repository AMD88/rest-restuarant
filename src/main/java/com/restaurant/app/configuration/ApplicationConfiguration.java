package com.restaurant.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan(basePackages = "com.restaurant.app")
public class ApplicationConfiguration extends WebMvcConfigurationSupport{

}
