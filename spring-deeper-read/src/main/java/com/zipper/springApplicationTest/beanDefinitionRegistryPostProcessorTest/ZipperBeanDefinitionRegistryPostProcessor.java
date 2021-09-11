package com.zipper.springApplicationTest.beanDefinitionRegistryPostProcessorTest;

import com.zipper.springApplicationTest.beanFactoryPostProcessorTest.ZipperLog;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class ZipperBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    //bean定义的后置处理器
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("ZipperBeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法");
        System.out.println("bean定义的数据量：" + registry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(ZipperLog.class);
        registry.registerBeanDefinition("zipperLog",rootBeanDefinition);
    }

    //bean工程的后置处理器
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("ZipperBeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法");
        System.out.println("bean定义的数据量：" + beanFactory.getBeanDefinitionCount());
    }
}
