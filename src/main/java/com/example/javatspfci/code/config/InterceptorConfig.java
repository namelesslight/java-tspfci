package com.example.javatspfci.code.config;

import com.example.javatspfci.code.intereptor.AdminInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置类
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截需要管理员权限的路径
        String[] addSuperAdminPathPatterns = {
        };
        //拦截需要配送员权限的路径
        String[] addDeliverPathPatterns = {
        };
        //拦截需要厂家权限的路径
        String[] addUserAdminPathPatterns = {
        };
        //拦截需要店家权限的路径
        String[] addUserPathPatterns = {
        };
        //excludePathPatterns排除的路径
        String[] excludePathPatterns = {

        };
    }
}
