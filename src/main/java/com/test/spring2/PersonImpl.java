package com.test.spring2;

public class PersonImpl implements Person {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        if (null == name) {
            return "Hello, zhangsan";
        }
        return "Hello, " + name;
    }
}
