package com.xuge.service.Impl;

import com.xuge.bean.User;
import com.xuge.dao.Impl.UserMapperImpl;
import com.xuge.dao.UserMapper;
import com.xuge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author: yjx
 * Date :2022/8/1616:45
 **/
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper ;


  public int save(User user) {
    return userMapper.insert(user);
  }
}