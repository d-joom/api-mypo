package com.mypo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//(exclude = DataSourceAutoConfiguration.class)
public class MypoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypoApplication.class, args);
		
		System.out.println("-------------test------------------");
		
		
	}

}
