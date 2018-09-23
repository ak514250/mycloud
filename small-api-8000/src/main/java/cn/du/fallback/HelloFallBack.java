package cn.du.fallback;

import cn.du.service.HellowService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloFallBack
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/23 9:38
 **/
@Component
public class HelloFallBack implements FallbackFactory<HellowService> {
    @Override
    public HellowService create(Throwable throwable) {
        return new HellowService() {
            @Override
            public String hello() {
                return "no-hello";
            }
        };
    }
}
