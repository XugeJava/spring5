package com.xuge.service.staticProxy;

/**
 * author: yjx
 * Date :2022/8/1816:07
 **/
public class Client {
  public static void main(String[] args) {
    Service agent=new Agent(new BookService(),new LogAop());
//    agent.buy();

    //商品业务代理
    //再代理日志
    agent=new Agent(agent,new TranAop());
    agent.buy();

  }
}
