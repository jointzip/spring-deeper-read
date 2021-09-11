package com.zipper.springApplicationTest.testSpringIocStarter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(context.getBean(ZipperDao.class));
    }
}
