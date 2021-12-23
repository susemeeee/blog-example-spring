/*
 * WebMvcConfig.java
 * Author : 박찬형
 * Created Date : 2021-12-18
 */
package com.example.examplespringsecurityjwt.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/success").setViewName("success");
        registry.addViewController("/admin").setViewName("admin");
    }
}
