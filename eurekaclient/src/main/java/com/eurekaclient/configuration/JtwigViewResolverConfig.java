package com.eurekaclient.configuration;


import com.lyncode.jtwig.mvc.JtwigViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;

/**
 * Created by jarodllo on 15/1/16.
 */
@Configuration
public  class JtwigViewResolverConfig {

    @Bean
    public ViewResolver viewResolver() {
        JtwigViewResolver viewResolver = new JtwigViewResolver();
        viewResolver.setPrefix("classpath:/templates/");
        viewResolver.setSuffix(".twig");
        return viewResolver;
    }
}