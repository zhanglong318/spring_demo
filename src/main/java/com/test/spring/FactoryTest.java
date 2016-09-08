package com.test.spring;

public class FactoryTest {

    public static void main(String[] args) {

        Person p1 = PersonFactory.getPerson("Chinese");

        System.out.println(p1.sayHello("zhangsan"));
        System.out.println(p1.sayGoodbye("zhangsan"));

        p1 = PersonFactory.getPerson("American");

        System.out.println(p1.sayHello("zhangsan"));
        System.out.println(p1.sayGoodbye("zhangsan"));
    }
}
