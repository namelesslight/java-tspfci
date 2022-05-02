package com.example.javatspfci.code.config;

import com.example.javatspfci.code.intereptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns拦截的路径
        String[] addPathPatterns = {
            "/superAdmin/queryLogPageByRole/**"
        };
        //excludePathPatterns排除的路径
        String[] excludePathPatterns = {

        };
        registry.addInterceptor(new AdminInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
