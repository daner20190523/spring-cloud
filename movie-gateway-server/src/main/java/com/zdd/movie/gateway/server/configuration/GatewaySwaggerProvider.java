package com.zdd.movie.gateway.server.configuration;

import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.support.NameUtils;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class GatewaySwaggerProvider implements SwaggerResourcesProvider {

    public static final String API_URL = "/v2/api-docs";
    private final RouteLocator routeLocator;
    private final GatewayProperties gatewayProperties;

    public GatewaySwaggerProvider(RouteLocator routeLocator, GatewayProperties gatewayProperties) {
        this.routeLocator = routeLocator;
        this.gatewayProperties = gatewayProperties;
    }

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> swaggerResourceList = new ArrayList<>();
        List<String> routeList = new ArrayList<>();
        routeLocator.getRoutes().subscribe(route -> routeList.add(route.getId()));
        gatewayProperties.getRoutes().stream()
                .filter(routeDefinition -> routeList.contains(routeDefinition.getId()))
                .forEach(routeDefinition -> {
                    routeDefinition.getPredicates().stream()
                            .filter(predicateDefinition -> ("Path").equals(predicateDefinition.getName()
                            ))
                            .forEach(predicateDefinition -> {
                                System.out.print("紧急修复");
                                System.out.println(routeDefinition.getId());
                                System.out.println(predicateDefinition.getArgs().get("\"pattern\"").replace("/**",API_URL));
                                swaggerResourceList.add(swaggerResource(routeDefinition.getId(),predicateDefinition.getArgs().get("\"pattern\"").replace("/**",API_URL)));
                            });
                });
        return swaggerResourceList;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }
}
