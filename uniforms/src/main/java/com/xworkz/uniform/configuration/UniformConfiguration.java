package com.xworkz.uniform.configuration;

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
@ComponentScan("com.xworkz.uniform")
@PropertySource("classpath:application.properties")
@EnableWebMvc

public class UniformConfiguration implements WebMvcConfigurer {

    public UniformConfiguration()
    {
        System.out.println("Created UniformConfiguration");
    }

    @Bean
    public ViewResolver viewResolver()
    {
        System.out.println("Registering viewResovler");
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;

    }


    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        System.out.println("Adding resource handlers");
        //WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/js/**").addResourceLocations("/javascript/");
    }
}
