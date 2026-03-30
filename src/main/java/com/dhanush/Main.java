// src/main/java/com/dhanush/Main.java
package com.dhanush;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
            Alien obj = context.getBean("alien1", Alien.class);;
            System.out.println(obj.getAge());

            obj.code();

            System.out.println("Hello and welcome!");
        }
    }
}
