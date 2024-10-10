package com.kailis.snippet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExternalApiSnippetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApiSnippetApplication.class, args);
	}

}
