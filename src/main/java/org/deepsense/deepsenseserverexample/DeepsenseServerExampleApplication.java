package org.deepsense.deepsenseserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration    // spring boot auto configuration
@EnableScheduling
@EnableAsync
@ComponentScan(basePackages = {"org.deepsense"})   // scans the source code for
@EnableSwagger2
public class DeepsenseServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeepsenseServerExampleApplication.class, args);
	}

}
