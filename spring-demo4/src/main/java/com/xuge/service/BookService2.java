package com.xuge.service;

/**
 * author: yjx
 * Date :2022/8/1815:52
 **/
//使用子类代理的方式将购买业务和事务拆分
public class BookService2 {
  //在父类中只有业务
  public void  buy(){
    System.out.println("图书购买业务..");
  }
}
