package com.auth.server.system.core.domain.service;

import com.auth.server.common.core.domain.service.IService;
import com.auth.server.system.core.domain.entity.User;
import com.auth.server.system.core.domain.entity.bo.UserBo;
import com.auth.server.system.core.domain.entity.vo.UserVo;

import java.util.List;

/**
 * @author yanweiol
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2023-10-06 17:48:25
 */
public interface UserService extends IService<User, UserVo> {

    /**
     * 基于userBo 获取List<vo>
     *
     * @param userBo UserBo请求实体
     * @return List<UserVo>
     */
    List<UserVo> selectVoList(UserBo userBo);
}
