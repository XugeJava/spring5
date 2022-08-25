package com.xuge.service;

/**
 * author: yjx
 * Date :2022/8/1815:49
 **/
//图书业务和购买业务和事务切面耦合在一起
public class BookService {
  public void buy(){
    try
    {
      System.out.println("事务开启..");
      System.out.println("图书购买业务..");
      System.out.println("事务提交..");

    }catch (Exception e ){
      System.out.println("事务回滚...");
    }

  }


}
