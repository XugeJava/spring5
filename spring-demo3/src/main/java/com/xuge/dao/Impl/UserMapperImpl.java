package com.xuge.dao.Impl;

import com.xuge.bean.User;
import com.xuge.dao.UserMapper;
import org.springframework.stereotype.Repository;

/**
 * author: yjx
 * Date :2022/8/1616:44
 **/
@Repository
public class  UserMapperImpl implements UserMapper {

  public int insert(User user) {
    System.out.println("用户数据加入成功..");
    return 1;
  }
}
