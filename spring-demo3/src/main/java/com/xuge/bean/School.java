package com.xuge.bean;

import lombok.Data;

/**
 * author: yjx
 * Date :2022/8/1616:32
 **/
@Data
public class School {
  private String name;

  public School() {
    System.out.println("学校无参构造..");
  }
}
