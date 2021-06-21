package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProxServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxServiceApplication.class, args);
	}
/**
	@Bean
	RouteLocator staticsRoutes(RouteLocatorBuilder builder) {
		return builder.routes().route(r->r.path("/comptes/**").uri("lb://COMPTE-SERVICE")).build();
		//http://localhost:8082
	}
**/
	
	@Bean
	DiscoveryClientRouteDefinitionLocator dynamicRoutes(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {

		return new DiscoveryClientRouteDefinitionLocator(rdc,  dlp);
	}
}
