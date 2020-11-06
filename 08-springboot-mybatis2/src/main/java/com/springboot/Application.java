package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 开启Springboot的配置
@MapperScan(basePackages = "com.springboot.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
/*
* springboot 集成MyBatis的步骤
* 1.首先，在pom.xml中添加依赖：mysql驱动 以及 MyBits整合Springboot的依赖
* 2.生成mybatis逆向工程：编写GeneratorMapper.xml，放到根目录（和pom.xml同级）
* 3.将逆向工程的插件，一段代码，放到pom.xml文件中
* 4.打开右侧的Maven，找到对应模块的Plugins,代开mybatis-gengerator
*   双击下面的mybatis-gengerator.generate
* 5.编写web下面的EmpController,再编写Empservice接口,实现类
* 6.在核心配置文件中设置连接数据库的配置
* 7.在pom.xml中，手动指定资源文件夹
* 8.启动入口类
* 9.如果网页打不开，看下右边的Maven是否有一个小圈圈，点击更新一下，就可以了
* */