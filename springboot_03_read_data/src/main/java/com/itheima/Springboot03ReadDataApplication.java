package com.itheima;

import com.itheima.domain.Enterprise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({Enterprise.class})
public class Springboot03ReadDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03ReadDataApplication.class, args);
	}

}
