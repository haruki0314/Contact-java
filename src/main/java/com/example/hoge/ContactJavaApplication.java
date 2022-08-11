package com.example.hoge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ContactJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactJavaApplication.class, args);
	}
}