package com.clh.spring.factory.support;

import com.clh.spring.factory.config.BeanDefinition;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
