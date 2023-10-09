package com.auth.server.system.core.domain.entity.bo;

import lombok.Data;

/**
 * 菜单实体
 *
 * @author yanweiol
 * @TableName menu
 */
@Data
public class MenuBo {
    /**
     * 菜单编码
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuName;

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
}