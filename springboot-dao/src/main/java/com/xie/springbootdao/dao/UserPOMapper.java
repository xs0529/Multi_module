package com.xie.springbootdao.dao;

import com.xie.springbootdao.po.UserPO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface UserPOMapper extends Mapper<UserPO>, MySqlMapper<UserPO> {
}