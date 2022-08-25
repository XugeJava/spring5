package Com.xugel;

import com.xuge.Service.Impl.SomeServiceImpl;
import com.xuge.Service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: yjx
 * Date :2022/8/2016:21
 **/
public class test1 {
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//    SomeService someService = (SomeService) context.getBean("someServiceImpl");
//    System.out.println(someService.getClass());
//    someService.doSome("xuge",10);

//    System.out.println("================");
//    someService.show();

    System.out.println("==============CGLIB代理..");
    SomeServiceImpl someService=(SomeServiceImpl)context.getBean("someServiceImpl");
//    System.out.println(someService.getClass());
//    System.out.println(someService.doSome("xuge", 123));
//    System.out.println("=====测试引用数据类型=====");
//    System.out.println(someService.test("xuge"));

    System.out.println("==========测试环绕通知=========");
    System.out.println(someService.doSome("xuge", 123));

  }
}
