package com.flamesunrises.springbootbasic.config;

import org.springframework.boot.SpringBootVersion;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * SwaggerConfig
 *
 * @author jay
 */
@EnableOpenApi
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).pathMapping("/")

                // 定义是否开启swagger，false为关闭，可以通过变量控制
                .enable(true)

                // 将api的元信息设置为包含在json ResourceListing响应中。
                .apiInfo(apiInfo());

        // 接口调试地址
        // .host(swaggerProperties.getTryHost())

        // 选择哪些接口作为swagger的doc发布
        // .select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build()

        // 支持的通讯协议集合
        // .protocols(newHashSet("https", "http"))

        // 授权信息设置，必要的header token等认证信息
        // .securitySchemes(securitySchemes())

        // 授权信息全局应用
        // .securityContexts(securityContexts());
    }

    /**
     * API 页面上半部分展示信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(" Api Doc").description("Desc")
                .contact(new Contact("lighter", null, "test@gmail.com"))
                .version("Application Version: " + ", Spring Boot Version: " + SpringBootVersion.getVersion()).build();
    }
}
