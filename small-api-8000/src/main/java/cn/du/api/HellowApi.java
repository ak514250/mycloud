package cn.du.api;

import cn.du.fallback.HelloFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @InterfaceName HellowApi
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/22 21:14
 **/
@FeignClient(value = "small-backstage", fallbackFactory = HelloFallBack.class)
public interface HellowApi {

    @RequestMapping("/hello")
    public String hello();
}
