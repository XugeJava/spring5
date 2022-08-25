package com.bjpowernode.test;

import com.bjpowernode.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public  void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService proxy = (BookService) ac.getBean("bookService");
        System.out.println(proxy.getClass());
        proxy.buy("张三","平凡的世界",55);
        proxy.comment("张三","还是很好看,可以看一看.....");
    }
}
