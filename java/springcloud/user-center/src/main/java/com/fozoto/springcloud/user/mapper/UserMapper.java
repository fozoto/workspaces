package com.fozoto.springcloud.user.mapper;

import com.fozoto.springcloud.user.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author qingyan on 2019-11-03
 */
@Repository
public interface UserMapper {

    /**
     * 创建用户
     *
     * @param user 用户
     */
    void add(User user);
}
