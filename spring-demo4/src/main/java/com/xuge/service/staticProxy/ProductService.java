package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:09
 **/
public class ProductService implements  Service{
  public void buy() {
    System.out.println("商品业务实现...");
  }
}
