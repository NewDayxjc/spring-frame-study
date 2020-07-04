package com.xjc.springboot.config.autoconfigured;

import com.xjc.springboot.config.service.AddressService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/7/4 16:22
 * @name AutoConfigureTest
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(AddressService.class)
public class AutoConfigureTest {

    @Bean
    @ConditionalOnMissingBean
    public AddressService addressService(AddressService addressService){
        addressService.toString();
        return addressService;
    }
}
