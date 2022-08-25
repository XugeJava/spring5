package com.xuge;

import com.xuge.annotation.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: yjx
 * Date :2022/8/1621:56
 **/
public class test1 {
  @Test
  public void test1(){
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    User user = context.getBean("user", User.class);
    System.out.println(user);


  }

  @Test
  public void test5(){
    String s1="h1";
    System.out.println(s1);
    s1+="llo";
    System.out.println(s1);
  }
  @Test
  public void test6(){

    ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
    User user = context.getBean("user", User.class);
    System.out.println(user);


  }
}
