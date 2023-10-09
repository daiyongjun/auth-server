package com.auth.server.system.core.domain.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户view
 *
 * @author yanweiol
 */
@Data
public class UserVo {
    /**
     * 角色与用户关联关系主键ID
     */
    private Long id;

    /**
     * 用户类型 1、管理平台账号 2、应用平台管理员 3、应用平台账号
     */
    private Integer type;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否删除 1(否) 0(是)
     */
    private Integer mark;
}