package com.xuge.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * author: yjx
 * Date :2022/8/1621:50
 **/
@Component//交给spring创建对象,就是在创建容器时创建对象
public class User {
  private String name;
  private Integer age;
  @Autowired//按类型注入:会丛spring bean 工厂寻找School类型对象
  @Qualifier("school")
  private School school;

  public User() {
    System.out.println("user无参构造试用版..");
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", school=" + school +
            '}';
  }
}

