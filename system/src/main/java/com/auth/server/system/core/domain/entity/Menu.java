package com.auth.server.system.core.domain.entity;

import com.auth.server.common.core.domain.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 菜单表
 *
 * @author yanweiol
 * @TableName menu
 */
@EqualsAndHashCode(callSuper = true)
@TableName(value = "menu")
@Data
public class Menu extends BaseEntity {
    /**
     * 菜单主键ID
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 菜单编码
     */
    @TableField(value = "menu_code")
    private String menuCode;

    /**
     * 菜单名称
     */
    @TableField(value = "menu_name")
    private String menuName;

    /**
     * 排序
     */
    @TableField(value = "menu_sequence")
    private Integer menuSequence;

    /**
     * 菜单状态 0(不隐藏) 1(隐藏)
     */
    @TableField(value = "menu_status")
    private Integer menuStatus;

    /**
     * 菜单类型 1(管理系统) 2(应用系统)
     */
    @TableField(value = "menu_type")
    private Integer menuType;

    /**
     * 上级菜单ID 0(根菜单)
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 是否删除 1(否) 0(是)
     */
    @TableLogic
    @TableField(value = "mark")
    private Integer mark;
}