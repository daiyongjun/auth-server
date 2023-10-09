package com.auth.server.system.core.domain.entity.bo;

import lombok.Data;

/**
 * 角色实体
 *
 * @author yanweiol
 * @TableName role
 */
@Data
public class RoleBo {
    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDescription;

    /**
     * 用户类型 1(管理平台账号) 2(应用平台管理员) 3(应用平台账号)
     */
    private Integer roleType;

    /**
     * 是否删除 1(否) 0(是)
     */
    private Integer mark;
}