package com.clh.spring.factory.config;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
