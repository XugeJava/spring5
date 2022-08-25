package com.xuge.service.Impl;

import com.xuge.bean.User;
import com.xuge.dao.Impl.UserMapperImpl;
import com.xuge.dao.UserMapper;
import com.xuge.service.UserService;

/**
 * author: yjx
 * Date :2022/8/1616:45
 **/
public class UserServiceImpl implements UserService {
  private UserMapper userMapper ;

  public void setUserMapper(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  public int save(User user) {
    return userMapper.insert(user);
  }
}