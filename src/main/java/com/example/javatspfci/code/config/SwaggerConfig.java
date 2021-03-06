package com.example.javatspfci.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket controllerApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        ApiInfo apiInfo = apiInfoBuilder
                .title("")
                .description("")
                .contact(new Contact("","https://github.com/namelesslight",""))
                .version("1.0.0")
                .build();
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo);
        docket.select()
                .apis(RequestHandlerSelectors
                .basePackage("com.example.javatspfci.code"))
                .paths(PathSelectors.any());
        return docket;
    }
}
