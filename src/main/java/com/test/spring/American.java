package com.test.spring;

public class American implements Person {

    @Override
    public String sayGoodbye(String name) {
        return name + " goodbye";
    }

    @Override
    public String sayHello(String name) {
        return name + " hello";
    }

}
