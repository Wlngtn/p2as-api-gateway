package com.br.p2as.p2as.Api.Gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	private static String PREFIXO_GATEWAY = "/psas-api/";
	private static String PREFIXO_URI_CLIENTE = "http://localhost:8080/";
	private static String PREFIXO_URI_PROFISSIONAL = "http://localhost:8081/";
	private static String PREFIXO_URI_PESSOA = "http://localhost:8082/";
	private static String VERSAO = "v1/api/";
	private static String CLIENTE = "clientes";
	private static String PROFISSIONAIS = "profissionais";
	private static String PESSOA = "pessoas";

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
			
		return builder.routes()
				.route(p -> p.path(PREFIXO_GATEWAY+VERSAO+PESSOA+"/**")
						.uri(PREFIXO_URI_PESSOA+VERSAO+PESSOA))
				
				.route(p -> p.path(PREFIXO_GATEWAY+VERSAO+CLIENTE+"/**")
						.uri(PREFIXO_URI_CLIENTE+VERSAO+CLIENTE))
				
				.route(p -> p.path(PREFIXO_GATEWAY+VERSAO+PROFISSIONAIS+"/**")
						.uri(PREFIXO_URI_PROFISSIONAL+VERSAO+PROFISSIONAIS))

				.build();
	}
	
}
