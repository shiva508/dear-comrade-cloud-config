package com.comrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DearComradeCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(DearComradeCloudConfigApplication.class, args);
	}

}
