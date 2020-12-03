package com.example.universityinfo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
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
    public Docket parkingLotApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("universityinfo").select()
                .apis(RequestHandlerSelectors.basePackage(
                        "com.example.universityinfo.controller"))
                .build();

    }
//https://app.swaggerhub.com/help/?_ga=2.252188297.1216588261.1605022505-1328577883.1603210072
/*
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("University Info API")
                .description("University Info API reference for developers")
                .termsOfServiceUrl("http://ParkingLot.com")
                .contact(new Contact("University Info Application", "http://ParkingLot.com", "parkinglot@gmail.com")).license("Parking Lot License")
                .licenseUrl("parkinglot@gmail.com").version("1.0").build();
    }
    */


}

