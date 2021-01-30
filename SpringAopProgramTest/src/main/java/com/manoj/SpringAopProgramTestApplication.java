package com.manoj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopProgramTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopProgramTestApplication.class, args);
	}

}
