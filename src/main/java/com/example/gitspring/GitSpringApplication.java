package com.example.gitspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(GitSpringApplication.class, args);
        System.out.println(111);
        System.out.println(22222);
        System.out.println(3333f);
        System.out.println("hotfix");
        System.out.println("master");

        System.out.println("hotfix2");
        System.out.println("push2");
         System.out.println("pull");
        System.out.println("add");

    }


}
