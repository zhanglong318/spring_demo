package com.test.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class SpringTest {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(resource);

        Person p1 = (Person) factory.getBean("chinese");

        System.out.println(p1.sayHello("zhangsan"));
        System.out.println(p1.sayGoodbye("zhangsan"));

        p1 = (Person) factory.getBean("american");

        System.out.println(p1.sayHello("zhangsan"));
        System.out.println(p1.sayGoodbye("zhangsan"));
    }
}
