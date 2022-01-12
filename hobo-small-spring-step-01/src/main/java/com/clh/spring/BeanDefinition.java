package com.clh.spring;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
