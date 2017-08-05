package com.smart.ioc;

/**
 * 1.接口注入时，需要实现的接口
 * 2.子类中需要有GeLi类，以便被注入
 */
public interface ActorArrangable {
   void injectGeli(GeLi geli);
}
