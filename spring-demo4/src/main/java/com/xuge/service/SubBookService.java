package com.xuge.service;

/**
 * author: yjx
 * Date :2022/8/1815:54
 **/
//子类就是代理类，负责将图书购买功能添加到事务切面
public class SubBookService extends BookService2 {
  @Override
  public void buy() {
    try {
      //事务切面
      System.out.println("事务开启..");
      super.buy();
      //事务切面
      System.out.println("实物图提交..");
    } catch (Exception e) {
      //事务回滚
      System.out.println("事务回滚..");
    }

  }



}
