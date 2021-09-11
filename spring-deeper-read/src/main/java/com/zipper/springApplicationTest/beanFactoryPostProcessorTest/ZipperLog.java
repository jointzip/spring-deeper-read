package com.zipper.springApplicationTest.beanFactoryPostProcessorTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ZipperLog {
    @Value("zhaopo")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZipperLog() {
        System.out.println("我是ZipperLog的无参构造方法");
    }

    public ZipperLog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ZipperLog{" +
                "name='" + name + '\'' +
                '}';
    }
}
