package com.auth.server.system.core.domain.entity.vo;

import lombok.Data;

/**
 * 菜单实体
 *
 * @author yanweiol
 * @TableName menu
 */
@Data
public class MenuVo {
    /**
     * 菜单主键ID
     */
    private Long id;

    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 排序
     */
    private Integer menuSequence;

    /**
     * 菜单状态 0(不隐藏) 1(隐藏)
     */
    private Integer menuStatus;

    /**
     * 菜单类型 1(管理系统) 2(应用系统)
     */
    private Integer menuType;

    /**
     * 上级菜单ID 0(根菜单)
     */
    private Long parentId;

    /**
     * 是否删除 1(否) 0(是)
     */
    private Integer mark;
}