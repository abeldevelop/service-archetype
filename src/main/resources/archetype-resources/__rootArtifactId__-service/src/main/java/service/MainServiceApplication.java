#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"${symbol_dollar}{abeldevelop.configuration.component-scan}"})
@EntityScan("${symbol_dollar}{abeldevelop.configuration.entity-scan}")
@EnableJpaRepositories("${symbol_dollar}{abeldevelop.configuration.enable-jpa-repositories}")
@EnableDiscoveryClient
@SpringBootApplication
public class MainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainServiceApplication.class, args);
	}

}
