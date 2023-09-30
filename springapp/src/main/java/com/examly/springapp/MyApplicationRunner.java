package com.examly.springapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Spring IoC project has started successfully!");

    }
}

// package com.examly.springapp;

// @Component
// public class MyApplicationRunner implements ApplicationRunner {
