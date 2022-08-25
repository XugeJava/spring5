package com.xuge.Service.aop;

import com.xuge.bean.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * author: yjx
 * Date :2022/8/2016:12
 * 此类为切面类，包含各种切面方法
 **/
@Aspect//交给Aspect的框架去实现切面类
@Component
public class MyAspewct {
  /**
   * /**
   * <p>
   * * 所有切面的功能都是由切面方法来实现的
   * 可以将各种切面都在此类中进行开发
   * *
   * * 前置通知的切面方法的规范
   * 1)访问权限是public
   * 2)方法的返回值是void
   * 3)方法名称自定义
   * 4)方法没有参数,如果有也只能是JoinPoint类型
   * 5)必须使用@Before注解来声明切入的时机是前切功能和切入点
   * 参数:value  指定切入点表达式
   * *
   * 业务方法
   * public String doSome(String name, int age)
   */

//  @Before(value = "execution(public String com.xuge.Service.Impl.SomeServiceImpl.*(String,int))")
//  public void before(){
//    System.out.println("前置通知实现...");
//  }
  //修饰权限为public 任一返回值 SomeServiceImpl 类下的任意方法
//  @Before(value = "execution(public * com.xuge.Service.Impl.SomeServiceImpl.*(..))")
//  public void beforeShow(){
//    System.out.println("前置通知实现...");
//  }
  //修饰权限不限 在Impl包下的任意类的任意方法
  @Before(value = "myCut()")
  public void beforeShow(JoinPoint joPoint) {
    System.out.println("前置通知实现...");
    System.out.println("目标方法的签名:" + joPoint.getSignature());
    System.out.println("目标方法的参数:" + Arrays.toString(joPoint.getArgs()));
  }
//  //修饰权限不限 在Impl包及其子包下的任意类的任意方法
//  @Before(value = "execution(public * com.xuge.Service.Impl..*(..))")
//  public void beforeShow(){
//    System.out.println("前置通知实现...");
//  }
  //任意权限任意包下的任意方法
//  @Before(value = "execution(**(..))")
//  public void beforeShow(){
//    System.out.println("前置通知实现...");
//  }

  /**
   * 后置通知的方法的规范
   * 1)访问权限是public
   * 2)方法没有返回值void
   * 3)方法名称自定义
   * 4)方法有参数(也可以没有参数,如果目标方法没有返回值,则可以写无参的方法,但一般会写有参,这样可以处理无参可以处理有参),这个切面方法的参数就是目标方法的返回值
   * 5)使用@AfterReturning注解表明是后置通知
   * 参数:
   * value:指定切入点表达式
   * returning:指定目标方法的返回值的名称,则名称必须与切面方法的参数名称一致.
   */

//  @AfterReturning(value = "execution(* com.xuge.Service.Impl.*.*(..))", returning = "res")
//  public void myAfterReturning(Object res) {
//    System.out.println("后置通知功能实现..............");
//    if (res != null) {
//      if (res instanceof String) {
//        res = res.toString().toUpperCase();
//        System.out.println("在切面方法中目标方法的返回值:" + res);
//      }
//      if (res instanceof Student) {
//        Student stu = (Student) res;
//        stu.setName("李四");
//        System.out.println("在切面方法中目标方法的返回值:" + stu);
//      }
//    }
//
//
//  }
  /**

   * 环绕通知方法的规范
   * 1)访问权限是public
   * 2)切面方法有返回值,此返回值就是目标方法的返回值
   * 3)方法名称自定义
   * 4)方法有参数,此参数就是目标方法
   * 5)回避异常Throwable
   * 6)使用@Around注解声明是环绕通知
   参数:
   * value:指定切入点表达式
   */
  @Around(value = "myCut()")
  public  Object  myAround(ProceedingJoinPoint pjp)  throws   Throwable{
    System.out.println("环绕通知中前置功能实现...");
    //得到目标方法的返回值
    Object obj = pjp.proceed(pjp.getArgs());
    System.out.println("环绕后置功能实现..");
    return  obj.toString().toLowerCase();


  }
  @After(value = "myCut()")
  public  void  after(){
    System.out.println("最终通知功能实现...");
  }
  @Pointcut(value="execution(* com.xuge.Service.Impl.*.*(..))")
  public void  myCut(){

  }

}
