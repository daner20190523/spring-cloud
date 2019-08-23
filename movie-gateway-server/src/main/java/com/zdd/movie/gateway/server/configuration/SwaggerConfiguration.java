//package com.zdd.movie.gateway.server.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.config.ResourceHandlerRegistry;
//import org.springframework.web.reactive.config.WebFluxConfigurer;
//
//@Configuration
//public class SwaggerConfiguration implements WebFluxConfigurer {
//    /**
//     *
//     * 显示swagger-ui.html文档展示页，还必须注入swagger资源：
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//                .addResourceLocations("classpath:/META-INF/resources/");
//        registry.addResourceHandler("/webjars/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
//}
