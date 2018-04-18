package com.xie.springbootdao.common.Service;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/18 13:15
 */
public interface BaseService<T> {
    List<T> selectAll();

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int batchDelete(List<String> list, String property, Class<T> clazz);

    int updateAll(T entity);

    int updateNotNull(T entity);

    List<T> selectByExample(Object example);
}
