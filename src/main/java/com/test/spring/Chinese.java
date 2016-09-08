package com.test.spring;

public class Chinese implements Person {

    @Override
    public String sayGoodbye(String name) {
        return name + " 再见";
    }

    @Override
    public String sayHello(String name) {
        return name + " 你好";
    }
}
