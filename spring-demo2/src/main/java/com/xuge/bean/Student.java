package com.xuge.bean;

import lombok.Data;

/**
 * author: yjx
 * Date :2022/8/1616:19
 **/
@Data
public class Student {
  private String name;
  private Integer age;
  private School  school;

  public Student() {
    System.out.println("学生的午餐构造方法...");
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", school=" + school +
            '}';
  }
}
