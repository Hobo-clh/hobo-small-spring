package com.clh.spring.factory.config;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class BeanDefinition {

    private final Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public Class<?> getBeanClass() {
        return beanClass;
    }
}
