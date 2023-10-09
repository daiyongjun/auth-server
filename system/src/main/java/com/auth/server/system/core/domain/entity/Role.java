package com.auth.server.system.core.domain.entity;

import com.auth.server.common.core.domain.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色表
 *
 * @author yanweiol
 * @TableName role
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value = "role")
@Data
public class Role extends BaseEntity {
    /**
     * 角色主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 角色编码
     */
    @TableField(value = "role_code")
    private String roleCode;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 角色描述
     */
    @TableField(value = "role_description")
    private String roleDescription;

    /**
     * 用户类型 1(管理平台账号) 2(应用平台管理员) 3(应用平台账号)
     */
    @TableField(value = "role_type")
    private Integer roleType;

    /**
     * 是否删除 1(否) 0(是)
     */
    @TableLogic
    @TableField(value = "mark")
    private Integer mark;
}