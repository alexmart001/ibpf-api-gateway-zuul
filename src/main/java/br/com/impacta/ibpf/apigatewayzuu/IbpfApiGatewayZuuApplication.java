package br.com.impacta.ibpf.apigatewayzuu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class IbpfApiGatewayZuuApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbpfApiGatewayZuuApplication.class, args);
	}

}
