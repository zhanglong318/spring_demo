package com.test.spring;

public class PersonFactory {

    public static Person getPerson(String str) {
        if ("Chinese".equalsIgnoreCase(str)) {
            return new Chinese();
        }

        return new American();
    }
}
