package com.xuge.test;

import com.xuge.bean.School;
import com.xuge.bean.Student;
import com.xuge.bean.User;
import com.xuge.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: yjx
 * Date :2022/8/1616:21
 **/
public class test1 {
  @Test
  public void t1(){
    //程序员创建对象
    Student student = new Student();
    System.out.println(student);


  }
  @Test
  public void t2(){
    //由spring容器创建对象

    //需要先创建容器对象，再从容器中取出对象==>创建容器同时对象就已经创建了
    ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext.xml");
    Student stu = context.getBean("stu", Student.class);
    System.out.println(stu);


  }
  @Test
  public void test3(){
    //通过容器取出学校对象
    ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext2.xml");
    School school = context.getBean("school", School.class);
    System.out.println(school);


  }
  @Test
  public void testDemo(){
    User user = new User();
    user.setAge(10);
    user.setId(20);
    user.setName("name");
    new UserController().save(user);
  }
  @Test
  public   void testSet(){
    //通过容器取出学校对象
    ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext.xml");
    UserController userController = context.getBean("userController", UserController.class);

    User user = new User();
    user.setAge(10);
    user.setId(20);
    user.setName("name");
    userController.save(user);

  }
}
