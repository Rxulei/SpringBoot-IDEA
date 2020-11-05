package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Springboot项目的启动入口类
@SpringBootApplication
public class Application {
	// springboot项目的代码，
	// 必须放在Application类所在的同级目录或同级目录的下级目录
	// 在Application类所在的包下面，新建一个包：web
	// 在web包中新建一个类，IndexController

	// 写完IndexController类之后，运行Application类，就可以启动Springboot了
	// Tomcat started on port(s): 8080 (http) with context path ''
	// 打开浏览器，输入网址：http://localhost:8080/springboot/say
	// 显示：Hello, SpringBoot!!!
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
