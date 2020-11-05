package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	/*
	* Tomcat started on port(s): 8082 (http) with context path '/new'
	* 输入网址：http://localhost:8082/new/say?message=JamesHarden
	* 传入参数：先写一个?，再写message=String类型的参数值
	* 输出  say: hello JamesHarden !
	* */

}
