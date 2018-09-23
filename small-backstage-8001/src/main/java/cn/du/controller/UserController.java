package cn.du.controller;

import cn.du.po.TbUser;
import cn.du.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author durenhao
 * @Date 2018/9/23 13:29
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<TbUser> getUsers(){
        return userService.getUsers();
    }

}
