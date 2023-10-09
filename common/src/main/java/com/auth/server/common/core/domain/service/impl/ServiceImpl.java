package com.auth.server.common.core.domain.service.impl;

import com.auth.server.common.core.domain.service.IService;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.ReflectionKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 自定义 IService 接口具体实现, 基于IService接口二次改造(扩展T类型->V类型)
 *
 * @param <M> M extends BaseMapper<E>
 * @param <E> table entity 泛型
 * @param <V> vo 泛型
 * @author yanweiol
 * @createDate 2023-10-06 17:48:25
 */
@Slf4j
@SuppressWarnings("unchecked")
@Component
public class ServiceImpl<M extends BaseMapper<E>, E, V> implements IService<E, V> {

    @Autowired
    protected M baseMapper;

    public ServiceImpl() {
    }

    @Override
    public BaseMapper<E> getBaseMapper() {
        return this.baseMapper;
    }

    @Override
    public Class<V> currentVoClass() {
        return (Class<V>) ReflectionKit.getSuperClassGenericType(this.getClass(), ServiceImpl.class, 2);
    }

    @Override
    public Class<E> getEntityClass() {
        return (Class<E>) ReflectionKit.getSuperClassGenericType(this.getClass(), ServiceImpl.class, 1);
    }
}
