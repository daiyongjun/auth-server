package com.auth.server.common.core.domain.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import com.auth.server.common.core.domain.utils.BeanCopyUtils;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.io.Serializable;
import java.util.List;

/**
 * 自定义 IService 接口, 基于IService接口二次改造(扩展T类型->V类型)
 *
 * @param <E> table entity 泛型
 * @param <V> vo 泛型
 * @author yanweiol
 * @createDate 2023-10-06 17:48:25
 */
@SuppressWarnings("unchecked")
public interface IService<E, V> {

    /**
     * 获取当前BaseMapper<E> mapper (钩子方法)
     *
     * @return BaseMapper<E>
     */
    BaseMapper<E> getBaseMapper();

    /**
     * 获取Class<V>泛型(钩子方法)
     *
     * @return Class<V>
     */
    Class<V> currentVoClass();

    /**
     * 获取Class<E>泛型(钩子方法)
     *
     * @return Class<E>
     */
    Class<E> getEntityClass();

    /**
     * 基于ID获取Vo实体
     *
     * @param id 主键
     * @return Vo实体
     */
    default V selectVoById(Serializable id) {
        return selectVoById(id, this.currentVoClass());
    }


    /**
     * 拓展this.selectById(id)方法,具体实现ID获取Vo实体
     *
     * @param id      主键
     * @param voClass Vo实体类型
     * @param <C>     泛型声明
     * @return C
     */
    default <C> C selectVoById(Serializable id, Class<C> voClass) {
        E obj = this.getBaseMapper().selectById(id);
        if (ObjectUtil.isNull(obj)) {
            return null;
        }
        return BeanCopyUtils.copy(obj, voClass);
    }


    /**
     * 基于wrapper条件获取List<Vo>实体列表
     *
     * @param wrapper wrapper查询条件
     * @return List<V>
     */
    default List<V> selectVoList(Wrapper<E> wrapper) {
        return selectVoList(wrapper, this.currentVoClass());
    }

    /**
     * 拓展this.selectList(wrapper)方法,具体实现ID获取Vo实体
     *
     * @param wrapper wrapper查询条件
     * @param voClass Vo实体类型
     * @param <C>     Vo实体类型的范型申明
     * @return List<C>
     */
    default <C> List<C> selectVoList(Wrapper<E> wrapper, Class<C> voClass) {
        List<E> list = this.getBaseMapper().selectList(wrapper);
        if (CollUtil.isEmpty(list)) {
            return CollUtil.newArrayList();
        }
        return BeanCopyUtils.copyList(list, voClass);
    }


    /**
     * 基于page,wrapper条件获取分页List<Vo>实体列表
     *
     * @param page    IPage<E>分页条件
     * @param wrapper wrapper<E>查询条件
     * @param <P>     泛型声明
     * @return P(extends IPage < V >)
     */
    default <P extends IPage<V>> P selectVoPage(IPage<E> page, Wrapper<E> wrapper) {
        return selectVoPage(page, wrapper, this.currentVoClass());
    }


    /**
     * 拓展this.selectPage(page, wrapper)方法,具体实现ID获取Page<Vo>实体
     *
     * @param page    IPage<E>查询的基础信息
     * @param wrapper Wrapper<E>查询条件
     * @param voClass Vo实体类型
     * @param <C>     Vo实体类型的范型申明
     * @param <P>     P返回类型的范型申明
     * @return P (P extends IPage<C>)
     */

    default <C, P extends IPage<C>> P selectVoPage(IPage<E> page, Wrapper<E> wrapper, Class<C> voClass) {
        IPage<E> pageData = this.getBaseMapper().selectPage(page, wrapper);
        IPage<C> voPage = new Page<>(pageData.getCurrent(), pageData.getSize(), pageData.getTotal());
        if (CollUtil.isEmpty(pageData.getRecords())) {
            return (P) voPage;
        }
        voPage.setRecords(BeanCopyUtils.copyList(pageData.getRecords(), voClass));
        return (P) voPage;
    }
}
