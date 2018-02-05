package com.smartfly.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hutao01
 * Spring Boot 应用启动类
 *
 * Application很简单，一个main函数作为主入口。SpringApplication引导应用，
 * 并将Application本身作为参数传递给run方法。具体run方法会启动嵌入式的Tomcat并初始化Spring环境及其各Spring组件
 */
/*@SpringBootApplication：Spring Boot应用的标识*/
@SpringBootApplication
/*mapper 接口类扫描配置*/
@MapperScan("com.smartfly.study.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
