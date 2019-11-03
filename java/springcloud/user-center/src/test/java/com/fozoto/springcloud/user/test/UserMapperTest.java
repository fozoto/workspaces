package com.fozoto.springcloud.user.test;

import com.fozoto.springcloud.user.entity.User;
import com.fozoto.springcloud.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author qingyan on 2019-11-03
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testAdd() {
        String id = UUID.randomUUID().toString().replace("-", "");
        User user = new User(id, "qingyan", "qingyan", "青烟", "13352916252", "朱占全", "360782199204166252", 1, 0);
        userMapper.add(user);
    }
}
