package com.xjc.springboot.config.jmx.demo.mbean;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/30 15:55
 * @name UserMbean
 */
public interface UserMBean {
    String getName();
    void setName(String name);
    void setPasswd(String passwd);
    String getPasswd();
    int add(int x,int y);

}
