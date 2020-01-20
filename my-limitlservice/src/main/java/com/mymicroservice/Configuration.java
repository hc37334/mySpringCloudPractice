package com.mymicroservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties( prefix = "limit-service") //'spring-boot-configuration-processor' to your classpath to generate configuration metadata
@Data
@NoArgsConstructor
public class Configuration {
	
	int max;
	int min;
}
