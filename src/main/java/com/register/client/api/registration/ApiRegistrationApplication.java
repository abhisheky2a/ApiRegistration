package com.register.client.api.registration;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ComponentScan("com.register.client.api.registration")
@EnableCaching
@EnableSwagger2
@SpringBootApplication
public class ApiRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRegistrationApplication.class, args);
	}
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build().apiInfo(apiInfo());                                          
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "AdvancedStoreInventoryManagement", 
          "Provided APIs are used to access features of Advanced Store Inventory Management System", 
          "API ASIM", 
          "Terms of service", 
          new Contact("Abhishek Chakraborty", "", "abhishek.y2a@gmail.com"), 
          "License of API", "API license URL", Collections.emptyList());
    }

}
