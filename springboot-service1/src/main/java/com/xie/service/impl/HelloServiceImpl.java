package com.xie.service.impl;

import com.xie.service.HelloService;
import com.xie.springbootdao.dao.UserTMapper;
import com.xie.springbootdao.model.UserT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/17 14:37
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    UserTMapper userTMapper;
    @Override
    public List<UserT> getUsers() {
        return userTMapper.selectByExample(null);
    }

    @Override
    public UserT getUserById(Byte id) {
        return userTMapper.selectByPrimaryKey(id);
    }
}
