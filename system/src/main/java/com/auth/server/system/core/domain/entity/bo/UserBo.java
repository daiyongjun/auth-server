package com.auth.server.system.core.domain.entity.bo;

import lombok.Data;

/**
 * 用户实体
 *
 * @author yanweiol
 */
@Data
public class UserBo {
    /**
     * 用户类型 1、管理平台账号 2、应用平台管理员 3、应用平台账号
     */
    private Integer type;

    /**
     * 用户名
     */
    private String username;
}