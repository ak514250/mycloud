package cn.du.fallback;

import cn.du.api.HellowApi;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @ClassName HelloFallBack
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/23 9:38
 **/
@Component
public class HelloFallBack implements FallbackFactory<HellowApi> {
    @Override
    public HellowApi create(Throwable throwable) {
        return new HellowApi() {
            @Override
            public String hello() {
                return "no-hello";
            }
        };
    }
}
