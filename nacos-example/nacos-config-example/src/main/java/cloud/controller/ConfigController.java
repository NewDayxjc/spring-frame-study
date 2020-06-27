package cloud.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/23 16:15
 * @name ConfigController
 */
@RestController
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${useLocalCache:false}",autoRefreshed = true)
    private boolean useLocalCache;


    @GetMapping(value = "/get")
    public boolean get(){
        return useLocalCache;
    }

}
