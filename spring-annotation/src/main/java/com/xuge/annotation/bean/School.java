package com.xuge.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * author: yjx
 * Date :2022/8/1622:01
 **/
@Component("schoolNew")
public class School {
  @Value("xuge")
  private String name;
  @Value("100")
  private int age;

  public School() {
    System.out.println("school 午餐构造..");
  }

  @Override
  public String toString() {
    return "School{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
