# 认证/鉴权

## 鉴权

### 应用系统

- 系统管理

    - 角色管理

      *表结构*

         ```
      -- auth_table.user definition
      DROP TABLE IF EXISTS auth_table.`user`;
      CREATE TABLE auth_table.`user`
      (
          `id`          bigint                                                       NOT NULL,
          `type`        tinyint                                                      NOT NULL DEFAULT '1' COMMENT '用户类型 1、管理平台账号 2、应用平台管理员 3、应用平台账号',
          `username`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
          `password`    varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci         DEFAULT NULL COMMENT '密码',
          `mark`        tinyint                                                               DEFAULT '1' COMMENT '是否删除 1(否) 0(是)',
          `create_time` timestamp                                                    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
          `update_time` timestamp                                                    NULL     DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
          `create_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci          DEFAULT NULL COMMENT '添加人',
          `update_by`   varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci          DEFAULT NULL COMMENT '更新人',
          PRIMARY KEY (`id`) USING BTREE
      ) ENGINE = InnoDB
        DEFAULT CHARSET = utf8mb4
        COLLATE = utf8mb4_general_ci COMMENT ='用户表';
      
         ```



    - 新增

    - 删除

    - 编辑

    - 授权

- 教师管理

    - 新增

    - 删除

    - 编辑

### 后管系统

- 系统管理

    - 用户管理

      *表结构*

      ```
      -- edu_server.user definition
      
      CREATE TABLE `user` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `type` tinyint NOT NULL DEFAULT '1' COMMENT '用户类型 1、平台账号 2、应用平台管理员 3、应用平台账号',
        `username` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
        `password` varchar(256) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',
        `delete` tinyint DEFAULT '1' COMMENT '是否删除：1、否 2、是',
        `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
        `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
        `create_user` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '添加人',
        `update_user` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '更新人',
        PRIMARY KEY (`id`) USING BTREE
      ) ENGINE=InnoDB AUTO_INCREMENT=788 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='用户表';
      ```



    - 新增

    - 编辑

    - 删除

    - 角色配置

- 菜单管理

    - 新增

    - 删除

    - 编辑

- 学校菜单管理(应用系统)

    - 新增

    - 删除

    - 编辑

- 权限管理

    - 角色管理

        - 新增

        - 删除

        - 编辑

        - 授权

    - 接口权限(应用系统)

        - 新增

        - 删除

        - 编辑

        - 授权

- 学校管理(应用系统)

    - 学校管理

        - 新增

        - 删除

        - 编辑

    - 学校账号管理

        - 新增

        - 删除

        - 编辑

        - 权限配置

        - 重置密码



