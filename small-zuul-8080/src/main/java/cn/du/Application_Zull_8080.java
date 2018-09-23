package cn.du;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName Application_Zull_8080
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/22 20:59
 **/
@SpringBootApplication
@EnableZuulProxy
public class Application_Zull_8080 {

    public static void main(String[] args) {
        SpringApplication.run(Application_Zull_8080.class);
    }
}
