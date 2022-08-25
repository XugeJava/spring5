package com.xuge.service.proxy5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author: yjx
 * Date :2022/8/1816:36
 **/
public class ProxyFactory {
  public static Object getAgent(Service target, Aop aop) {
    //返回的是生成的代理对象
    return Proxy.newProxyInstance(
            //类加载器
            target.getClass().getClassLoader(),
            //目标对象实现的所有接口
            target.getClass().getInterfaces(),
            //代理对象实现匿名内部类实现
            new InvocationHandler() {
              @Override
              public Object invoke(


                      //代理对象
                      Object proxy,
                      //正在被调用的目标方法对象
                      Method method,
                      //目标方法参数
                      Object[] args) throws Throwable {
                Object res = null;
                try {
                  //切面
                  aop.before();
                  //业务
                  res = method.invoke(target, args);

                  //切面
                  aop.after();
                  //执行业务方法的返回值
                  return res;
                } catch (Exception e) {
                  aop.exception();
                }
                return null;

              }
            }
    );
  }

}
