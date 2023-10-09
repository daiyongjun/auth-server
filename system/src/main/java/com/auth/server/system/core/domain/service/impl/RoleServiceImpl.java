package com.auth.server.system.core.domain.service.impl;

import com.auth.server.common.core.domain.service.impl.ServiceImpl;
import com.auth.server.system.core.domain.entity.Role;
import com.auth.server.system.core.domain.entity.vo.RoleVo;
import com.auth.server.system.core.domain.service.RoleService;
import com.auth.server.system.core.domain.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
 * @author yanweiol
 * @description 针对表【role(角色表)】的数据库操作Service实现
 * @createDate 2023-10-08 20:15:52
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role, RoleVo>
        implements RoleService {

}




