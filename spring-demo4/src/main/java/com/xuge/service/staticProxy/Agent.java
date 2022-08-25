package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:04
 **/
public class Agent implements Service {
  //设计成员变量类型为接口，灵活切换目标对象
  private Service target;
  //使用构造方法传入目标对象
  //设置成员变量类型为接口，灵活切换目标对象
  private Aop aop;

  public Agent(Service target, Aop aop) {
    this.target = target;
    this.aop = aop;
  }

  public void buy() {
    try {
      //切面功能
      aop.before();
      //业务功能
      target.buy();
      //切面功能
      aop.after();
    } catch (Exception exception) {
      aop.exception();
    }
  }
}
