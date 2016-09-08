package com.test.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        Object object = enhancer.create();

        return object;
    }

    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2,
                            MethodProxy arg3) throws Throwable {
        System.out.println(arg0.getClass().getName() + "." + arg1.getName());

        // 执行父类的对应方法
        Object result = arg3.invokeSuper(arg0, arg2);

        System.out.println("执行结束！");

        return result;
    }

    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy();

        Person person = (Person) proxy.getProxy(Person.class);

        System.out.println(person.getClass().getName());
        System.out.println(person.getClass().getSuperclass().getName());

        person.study();
    }

}
