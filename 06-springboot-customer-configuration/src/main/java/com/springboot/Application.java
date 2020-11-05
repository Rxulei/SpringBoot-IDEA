package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	// 输入：http://localhost:8085/cust/cus
	// 输出：Hello customer South East University$:xulei$
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
