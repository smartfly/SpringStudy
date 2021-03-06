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
// mapper 接口类扫描包配置注解MapperScan
@MapperScan("com.smartfly.study.dao")
public class SpringStudyApplication {

	public static void main(String[] args) {
		/*程序启动入口，启动嵌入式的Tomcat并初始化Spring环境极其各Spring组件*/
		SpringApplication.run(SpringStudyApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("Let's inspect the beans provided by Spring Boot: ");
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//		};
//	}

}
