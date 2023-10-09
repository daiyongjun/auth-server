package com.auth.server.admin.controller;

import com.auth.server.system.core.domain.entity.bo.UserBo;
import com.auth.server.system.core.domain.entity.vo.UserVo;
import com.auth.server.system.core.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yanweiol
 * @description 用户管理(增 、 删 、 改 、 查)
 * @createDate 2023-10-06 17:48:25
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping()
    public void save(@Validated @RequestBody UserBo userBo) {

    }

    @DeleteMapping("/{ids}")
    public void remove(@PathVariable Long[] ids) {

    }

    @PutMapping("/{id}")
    public long edit(@PathVariable Long id, @Validated UserBo userBo) {
        return 1L;
    }


    /**
     * 基于主键ID获取用户信息
     *
     * @param id 用户主键ID
     * @return UserVo
     */
    @GetMapping("/{id}")
    public UserVo query(@PathVariable Long id) {
        return userService.selectVoById(id);
    }

    /**
     * 基于userBo获取用户Vo列表
     *
     * @param userBo 用户请求实体
     * @return List<UserVo>
     */
    @GetMapping("/list")
    public List<UserVo> query(@Validated UserBo userBo) {
        return userService.selectVoList(userBo);
    }
}
