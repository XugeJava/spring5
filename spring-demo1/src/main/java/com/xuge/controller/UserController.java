package com.xuge.controller;

import com.xuge.bean.User;
import com.xuge.service.Impl.UserServiceImpl;
import com.xuge.service.UserService;

/**
 * author: yjx
 * Date :2022/8/1616:45
 **/
public class UserController {
  private UserService userService=new UserServiceImpl();
  public  void save(User user){
    userService.save(user);
  }
}
