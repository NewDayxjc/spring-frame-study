package com.xjc.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.swing.*;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/28 16:40
 * @name Application
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return ()->42;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
//        System.exit(SpringApplication.exit(SpringApplication.run(Application.class,args)));
    }
}
