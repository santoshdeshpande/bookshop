package com.santoshs.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestBookshopApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookshopApplication::main).with(TestBookshopApplication.class).run(args);
	}

}
