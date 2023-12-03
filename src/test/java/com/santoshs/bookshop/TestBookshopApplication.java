package com.santoshs.bookshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

/**
 * Test for Bookshop application.
 */
@TestConfiguration(proxyBeanMethods = false)
public class TestBookshopApplication {

    /**
     * The main method to run the application for tests.
     *
     * @param args The arguments for the application.
     */
    public static void main(String[] args) {
        SpringApplication
                .from(BookshopApplication::main)
                .with(TestBookshopApplication.class)
                .run(args);
    }

}
