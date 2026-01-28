package com.example.PID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PidApplication {

	public static void main(String[] args) {
		SpringApplication.run(PidApplication.class, args);
	}

}
