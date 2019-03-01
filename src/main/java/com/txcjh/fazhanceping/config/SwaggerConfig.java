package com.txcjh.fazhanceping.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.InetAddress;

/**
 * @author Junhui Chen
 * @Title: SwaggerConfig
 * @ProjectName server
 * @Description: TODO 配置swagger，一个生成接口文档的工具
 * @date 2019/1/14 13:49
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public UiConfiguration getUiConfig() {
        return new UiConfiguration(
                null,// url,暂不用
                "none",       // docExpansion          => none | list
                "alpha",      // apiSorter             => alpha
                "schema",     // defaultModelRendering => schema
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS,
                false,        // enableJsonEditor      => true | false
                true);        // showRequestHeaders    => true | false
    }

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.txcjh.fazhanceping.controller")).paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        InetAddress ia = null;
        String localname = null;
        String localip = null;
        try {
            ia = InetAddress.getLocalHost();
            localname = ia.getHostName();
            localip = ia.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ApiInfoBuilder().title("软件学院").description("软件学院4班@" + localname)
                .termsOfServiceUrl("http://" + localip + "/swagger-ui.html")
                .version("1.0.0").build();
    }
}
