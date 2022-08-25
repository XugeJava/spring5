package com.xuge.controller;

import com.xuge.bean.User;
import com.xuge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * author: yjx
 * Date :2022/8/1616:45
 **/
@Controller
public class UserController {
  @Autowired
  private UserService userService;


  public  void save(User user){
    userService.save(user);
  }
}
