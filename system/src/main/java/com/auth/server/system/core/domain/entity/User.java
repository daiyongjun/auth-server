package com.auth.server.system.core.domain.entity;

import com.auth.server.common.core.domain.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户表
 *
 * @author yanweiol
 * @TableName user
 */
@Data
@TableName(value = "user")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
    /**
     * 角色与用户关联关系主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 用户类型 1、管理平台账号 2、应用平台管理员 3、应用平台账号
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 是否删除 1(否) 0(是)
     */
    @TableLogic
    @TableField(value = "mark")
    private Integer mark;
}