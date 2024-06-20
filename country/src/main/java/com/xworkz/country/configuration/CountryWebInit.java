package com.xworkz.country.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CountryWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    public CountryWebInit()
    {
        System.out.println("Created CountryWebInit");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{CountryPrimaryConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    public  void  configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
    {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }



}
