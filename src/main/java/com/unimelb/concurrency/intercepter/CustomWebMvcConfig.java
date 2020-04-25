package com.unimelb.concurrency.intercepter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CustomWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HttpInterceptor()).addPathPatterns("/**");
//                .excludePathPatterns("/user/login.do").excludePathPatterns("/user/register.do")
//                .excludePathPatterns("/user/send").excludePathPatterns("/index.html");
    }
}
