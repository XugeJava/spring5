package com.xuge.Service.Impl;

import com.xuge.Service.SomeService;
import com.xuge.bean.Student;
import org.springframework.stereotype.Component;

/**
 * author: yjx
 * Date :2022/8/2016:12
 **/
@Component("someServiceImpl")
public class SomeServiceImpl implements SomeService {
  public String doSome(String name, int age) {
    System.out.println("doSome()业务方法的实现");
    return "ABCD";
  }
  public Student  test(String name){
    System.out.println("test()方法实现====");
    return new  Student(name);
  }

  public void show() {
    System.out.println("show 方法被执行..");
  }
}
