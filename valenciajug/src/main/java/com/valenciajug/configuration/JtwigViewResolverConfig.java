package com.valenciajug.configuration;

import com.lyncode.jtwig.mvc.JtwigViewResolver;
import com.lyncode.jtwig.services.api.assets.AssetResolver;
import com.lyncode.jtwig.services.impl.assets.BaseAssetResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;


@Configuration
public class JtwigViewResolverConfig {

    @Bean
    public ViewResolver viewResolver() {
        JtwigViewResolver viewResolver = new JtwigViewResolver();
        viewResolver.setPrefix("classpath:/templates/");
        viewResolver.setSuffix(".twig");
        return viewResolver;
    }

    @Bean
    public AssetResolver assetResolver () {
        BaseAssetResolver assetResolver = new BaseAssetResolver();
        assetResolver.setPrefix("/public/");
        return assetResolver;
    }
}
