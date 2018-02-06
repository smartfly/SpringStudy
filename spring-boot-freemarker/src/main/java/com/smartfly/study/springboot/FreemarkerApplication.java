package com.smartfly.study.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Spring Boot 应用的标识*/
@SpringBootApplication
/*mapper 接口类扫描包配置*/
@MapperScan("com.smartfly.study.springboot.dao")
public class FreemarkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreemarkerApplication.class, args);
	}
}
