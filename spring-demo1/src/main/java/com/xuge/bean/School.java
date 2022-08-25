package com.xuge.bean;

import lombok.Data;

/**
 * author: yjx
 * Date :2022/8/1616:32
 **/

public class School {
  private String name;

  public School(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "School{" +
            "name='" + name + '\'' +
            '}';
  }
}
