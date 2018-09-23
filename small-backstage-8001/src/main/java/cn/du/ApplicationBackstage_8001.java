package cn.du;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @ClassName Application
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/21 23:07
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableRetry
@MapperScan(basePackages = {"cn.du.mapper","cn.du.mapper.base"})
public class ApplicationBackstage_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBackstage_8001.class);
    }

}
