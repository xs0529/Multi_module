package com.xie.springbootdao.dao;

import com.xie.springbootdao.po.PermissionPO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface PermissionPOMapper extends Mapper<PermissionPO>, MySqlMapper<PermissionPO> {
}