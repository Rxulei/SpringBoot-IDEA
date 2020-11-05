package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	// 新建一个包：controller，存放控制层的类
	// 新建一个IndexController
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
