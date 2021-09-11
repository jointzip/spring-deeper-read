package com.zipper.springApplicationTest.testApplicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ZipperApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("ZipperApplicationListener接收到了一个事件：" + event);
    }
}
