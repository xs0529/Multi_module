package com.xie.springbootdao.dao;

import com.xie.springbootdao.po.UserRolePO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserRolePOMapper extends Mapper<UserRolePO>, MySqlMapper<UserRolePO> {
}