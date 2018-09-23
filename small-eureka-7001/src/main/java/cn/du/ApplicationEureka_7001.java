package cn.du;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName ApplicationEureka_7001
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/22 10:56
 **/

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka_7001 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka_7001.class);
    }
}
