package com.projekat.rzk.config;

////import org.springframework.cloud.gateway.route.RouteLocator;
////import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
//
//
//import java.util.function.Function;
//
//import org.springframework.cloud.gateway.route.Route;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.Buildable;
//import org.springframework.cloud.gateway.route.builder.PredicateSpec;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//public class ApiGatewayConfiguration {
//
//	@Bean
//	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
//		return builder.routes()
////				.route(p->p.path("/filmovi/prikaz/**").uri("lb://online-prodaja-service"))
////				.route()
//////				.route(p->p.path("/korisnik/login/korIme/{korIme}/sifra/{sifra}/**").uri("lb://korisnik-service"))	
//////				.route(p->p.path("/korisnik/register/ime/{ime}/korIme/{korIme}/sifra/{sifra}/**").uri("lb://korisnik-service"))
//////					.filters(f->f.rewritePath("/say-hi", "/say/hello")).uri("lb://korisnik-service"))
////
////				.build();
//				
//				return builder.routes()
//						.route(routeFunction)
//						.route(p->p.path("/say/hello/**").uri("lb://movie-ranking-service"))
//						.route(p->p.path("/say-hi/**")
//							.filters(f->f.rewritePath("/say-hi", "/say/hello")).uri("lb://movie-ranking-service"))
//						
//						.build();
//			
//	}
//	
//}

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p->p.path("/filmovi/prikaz/**").uri("lb://online-prodaja-service"))
				.route(p->p.path("/karte/prikaz/**")
						.filters(f->f.rewritePath("/karte/prikaz", "/karte/prikaz")).uri("lb://online-prodaja-service"))
				.route(p->p.path("/karte/kupiKartu/**")
						.filters(f->f.rewritePath("/karte/kupiKartu", "/karte/kupiKartu")).uri("lb://online-prodaja-service"))
				.build();
	}
}
