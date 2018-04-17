package com.xie.service;

import com.xie.springbootdao.dao.UserTMapper;
import com.xie.springbootdao.model.UserT;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 谢霜
 * @Description
 * @date 2018/4/17 14:35
 */
public interface HelloService {
    public List<UserT> getUsers();
    public UserT getUserById(Byte id);
}
