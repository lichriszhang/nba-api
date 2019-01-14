package com.nba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nba.mapper")
public class NbaApp {

	public static void main(String[] args) {
		SpringApplication.run(NbaApp.class, args);
	}

}

