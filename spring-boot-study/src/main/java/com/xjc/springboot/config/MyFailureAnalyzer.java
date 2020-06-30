package com.xjc.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/29 18:13
 * @name MyFailureAnalyzer
 */
public class MyFailureAnalyzer extends AbstractFailureAnalyzer<NullPointerException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NullPointerException cause) {
        System.out.println("MyFailureAnalyzer");
        return new FailureAnalysis(cause.getMessage(),"请检查空指针",cause);
    }
}
