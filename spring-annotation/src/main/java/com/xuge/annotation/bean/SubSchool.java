package com.xuge.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * author: yjx
 * Date :2022/8/1814:57
 **/
@Component("school")
public class SubSchool extends  School{
  @Value("xuge123")
  private String name;
  @Value("23")
  private int id;

  public SubSchool() {
    System.out.println("subSchool 无参构造被调用..");
  }

  @Override
  public String toString() {
    return "SubSchool{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
  }
}
