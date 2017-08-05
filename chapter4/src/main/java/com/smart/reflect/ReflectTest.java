package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by mi-123 on 2017/6/13.
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 1.通过类装载器获取Car对象
         */
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.reflect.Car");

        Constructor cons = clazz.getDeclaredConstructor(null);
        /**
         * 2.通过默认构造器实例化Car
         */
        Car car = (Car) cons.newInstance();

        /**
         * 3.通过反射调用方法
         */
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗72");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setSpeed.invoke(car, 200);

        return car;
    }

    public static void main(String[] args) {
        Car car = null;
        try {
            car = initByDefaultConst();
        } catch (Exception e) {
            e.printStackTrace();
        }
        car.introduce();
    }
}
