package cn.du.controller;

import cn.du.api.HellowApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Hellow
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/22 13:07
 **/
@RestController
public class Hellow {

    @Autowired
    private HellowApi service;

    @RequestMapping("/hello")
    public String hello(){
        return "hello-8001";
    }

    @RequestMapping("/sayHellow")
    public String sayHellow(){
        return service.hello();
    }
}
