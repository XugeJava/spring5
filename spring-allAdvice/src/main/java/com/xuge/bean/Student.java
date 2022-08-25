package com.xuge.bean;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * author: yjx
 * Date :2022/8/2315:21
 **/
@Data
public class Student {
  private String name;

  public Student(String name) {
    this.name=name;
  }
}
