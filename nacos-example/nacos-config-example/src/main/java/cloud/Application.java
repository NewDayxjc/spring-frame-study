package cloud;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/13 17:02
 * @name Application
 * autoRefreshed:是否开启自动更新
 */

@SpringBootApplication
@NacosPropertySource(dataId = "example",autoRefreshed = true)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
