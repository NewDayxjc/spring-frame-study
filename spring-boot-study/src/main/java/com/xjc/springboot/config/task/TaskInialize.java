package com.xjc.springboot.config.task;

import com.xjc.springboot.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/30 17:09
 * @name TaskInialize
 */
@Component
public class TaskInialize {
    @Autowired
    private TestConfig testConfig;
    @Scheduled(cron = "0 * * * * ?")
    public void test(){
        System.out.println(testConfig.test().equals(1));
    }

    public TaskInialize() {
    }
}
