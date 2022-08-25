package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:03
 **/
public class BookService implements Service{
  public void buy() {
    System.out.println("购买业务实现/...");
  }
}
