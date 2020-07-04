package com.xjc.springboot.config;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/28 16:40
 * @name Application
 */
@SpringBootApplication
@EnableScheduling
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class Application {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(Application.class));
    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return ()->42;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
//        System.exit(SpringApplication.exit(SpringApplication.run(Application.class,args)));
    }
}
