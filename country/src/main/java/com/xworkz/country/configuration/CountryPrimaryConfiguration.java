package com.xworkz.country.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.country")
@PropertySource("classpath:application.properties")
@EnableWebMvc
public class CountryPrimaryConfiguration implements WebMvcConfigurer {

    public CountryPrimaryConfiguration() {
        System.out.println("Created CountryPrimaryConfiguration");
    }

    @Bean
    public ViewResolver viewResolver() {
        System.out.println("Ruuning viewResolver method in CountryPrimaryConfiguration");
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }


//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        System.out.println("Ruuning addResourceHandlers method in CountryPrimaryConfiguration");
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//    }
}
