package com.zipper.springApplicationTest.beanFactoryPostProcessorTest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * 意义是在获取bean定义之后，还没有实例化之前，可以进行操作
 */
@Component
public class ZipperBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("ioc容器调用了ZipperBeanFactoryPostProcessor的postProcessBeanFactory方法");
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            if("zipperLog".equals(beanDefinitionName)){
                //根据bean定义名称获取bean定义
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);//不是懒加载
                beanDefinition.setLazyInit(true);
                System.out.println("此时获取到了ZipperLog的bean定义");
            }
        }
    }
}
