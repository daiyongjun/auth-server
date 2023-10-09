package com.auth.server.system.core.domain.service.impl;

import com.auth.server.common.core.domain.service.impl.ServiceImpl;
import com.auth.server.system.core.domain.entity.User;
import com.auth.server.system.core.domain.entity.bo.UserBo;
import com.auth.server.system.core.domain.entity.vo.UserVo;
import com.auth.server.system.core.domain.mapper.UserMapper;
import com.auth.server.system.core.domain.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanweiol
 * @description 针对表【user(用户表)】的数据库操作Service实现
 * @createDate 2023-10-06 17:48:25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User, UserVo>
        implements UserService {

    @Override
    public List<UserVo> selectVoList(UserBo userBo) {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(ObjectUtils.isNotNull(userBo.getType()), User::getType, userBo.getType());
        queryWrapper.eq(ObjectUtils.isNotNull(userBo.getUsername()), User::getUsername, userBo.getUsername());
        return this.selectVoList(queryWrapper);
    }
}




