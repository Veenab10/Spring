package com.xworkz.uniform.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class UniformWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public  UniformWebInit()
    {
        System.out.println("Created UniformWebInit");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running getRootConfigClasses");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Running getServletConfigClasses");
        return new Class[]{UniformConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Running getServletMappings");
        return new String[]{"/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
