package com.xuge.bean;

import lombok.Data;

/**
 * author: yjx
 * Date :2022/8/1616:44
 **/
@Data
public class User {
  private Integer id;
  private String name;
  private Integer age;

  @Override
  public String toString() {
    return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
