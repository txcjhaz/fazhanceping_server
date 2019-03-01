package com.txcjh.fazhanceping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.txcjh.fazhanceping.mapper")
@EnableSwagger2
public class FazhancepingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FazhancepingApplication.class, args);
	}

}
