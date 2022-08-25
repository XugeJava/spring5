package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:23
 **/
public class TranAop implements  Aop{
  public void before() {
    System.out.println("事务开启..");
  }

  public void after() {
    System.out.println("事务提交..");
  }

  public void exception() {
    System.out.println("事务就滚..");
  }
}
