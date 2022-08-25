package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:19
 **/
public interface Aop {
  default void before(){}

  default void after(){}
  default void exception(){}
}
