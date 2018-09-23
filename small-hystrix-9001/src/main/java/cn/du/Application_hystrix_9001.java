package cn.du;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName Application_hystrix_9001
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/22 21:58
 **/
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class Application_hystrix_9001 {

    public static void main(String[] args) {
        SpringApplication.run(Application_hystrix_9001.class);
    }
}
