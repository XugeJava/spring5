package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:23
 **/
public class LogAop implements Aop{
  public void before() {
    System.out.println("日志开启..");
  }


}
