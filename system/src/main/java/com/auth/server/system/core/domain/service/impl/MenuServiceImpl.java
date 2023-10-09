package com.auth.server.system.core.domain.service.impl;

import com.auth.server.common.core.domain.service.impl.ServiceImpl;
import com.auth.server.system.core.domain.entity.Menu;
import com.auth.server.system.core.domain.entity.vo.MenuVo;
import com.auth.server.system.core.domain.service.MenuService;
import com.auth.server.system.core.domain.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
 * @author yanweiol
 * @description 针对表【menu(菜单表)】的数据库操作Service实现
 * @createDate 2023-10-09 08:39:32
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu, MenuVo>
        implements MenuService {

}




