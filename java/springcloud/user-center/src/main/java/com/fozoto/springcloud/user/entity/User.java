package com.fozoto.springcloud.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qingyan on 2019-11-03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /**
     * 用户id
     */
    private String id;

    /**
     * 登录名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号
     */
    private String telephone;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String identityCard;

    /**
     * 性别: 0-女, 1-男
     */
    private Integer gender;

    /**
     * 状态: 0-正常, 1-禁用
     */
    private Integer status;
}
