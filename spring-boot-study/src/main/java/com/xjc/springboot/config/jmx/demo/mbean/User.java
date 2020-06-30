package com.xjc.springboot.config.jmx.demo.mbean;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/30 15:56
 * @name User
 */
public class User implements UserMBean {
    private String name;
    private String passwd;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setPasswd(String passwd) {
        this.passwd=passwd;
    }

    @Override
    public String getPasswd() {
        return passwd;
    }

    @Override
    public int add(int x, int y) {
        return x+y;
    }
}
