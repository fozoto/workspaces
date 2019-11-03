package com.fozoto.springcloud.user.controller;

import com.fozoto.springcloud.user.entity.User;
import com.fozoto.springcloud.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author qingyan on 2019-11-03
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("add")
    public String add() {
        String id = UUID.randomUUID().toString().replace("-", "");
        User user = new User(id, "qingyan", "qingyan", "青烟", "13352916252", "朱占全", "360782199204166252", 1, 0);
        return userService.add(user);
    }
}
