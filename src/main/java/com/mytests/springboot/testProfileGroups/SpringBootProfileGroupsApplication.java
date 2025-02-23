package com.mytests.springboot.testProfileGroups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProfileGroupsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProfileGroupsApplication.class, args);
    }

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {

        for (String el : ctx.getBeanDefinitionNames()) {
            if (el.startsWith("_")) {
                System.out.println(el);
            }
        }
    }
}
