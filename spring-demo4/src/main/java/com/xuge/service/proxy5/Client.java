package com.xuge.service.proxy5;

import com.xuge.service.staticProxy.Agent;

/**
 * author: yjx
 * Date :2022/8/1816:07
 **/
public class Client {
  public static void main(String[] args) {
    Service agent=(Service)ProxyFactory.getAgent(new BookService(), new TranAop());
    System.out.println(agent.getClass());
    agent.buy();
    agent.update();


  }
}
