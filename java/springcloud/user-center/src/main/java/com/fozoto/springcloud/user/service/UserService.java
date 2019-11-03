package com.fozoto.springcloud.user.service;

import com.fozoto.springcloud.user.entity.User;
import com.fozoto.springcloud.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qingyan on 2019-11-03
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public String add(User user) {
        userMapper.add(user);
        return user.getId();
    }
}
