package com.xuge.service.proxy5;

/**
 * author: yjx
 * Date :2022/8/1816:03
 **/
public class BookService implements Service {
  @Override
  public void update() {
    System.out.println("这是update被调用..");
  }

  public void buy() {
    System.out.println("购买业务实现/...");
  }
}
