package cn.du;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ApplicationSearch_8101
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/22 11:43
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ApplicationSearch_8101 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSearch_8101.class);
    }
}
