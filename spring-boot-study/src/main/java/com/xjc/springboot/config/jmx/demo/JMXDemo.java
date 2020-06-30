package com.xjc.springboot.config.jmx.demo;

import com.xjc.springboot.config.jmx.demo.mbean.User;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/30 16:01
 * @name JMXDemo
 */
public class JMXDemo {
    public static void main(String[] args) throws MalformedObjectNameException, NullPointerException, InstanceAlreadyExistsException, MBeanRegistrationException, NotCompliantMBeanException, InterruptedException {
        MBeanServer server= ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName=new ObjectName("jmx:type=User");
        User bean=new User();
        server.registerMBean(bean, objectName);
        String oldName=null;
        String oldPwd=null;
        System.out.println("jmx started!!!");
        while(true){
            if(oldName!=bean.getName()|| oldPwd !=bean.getPasswd()){
                System.out.println(bean.getName()+":"+bean.getPasswd());
                oldName=bean.getName();
                oldPwd=bean.getPasswd();
            }
            System.out.println(bean.getName()+":"+bean.getPasswd());
            Thread.sleep(1000);
        }
    }

}
