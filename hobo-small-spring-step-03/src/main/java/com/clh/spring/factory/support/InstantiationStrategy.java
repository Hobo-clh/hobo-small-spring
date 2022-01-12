package com.clh.spring.factory.support;

import com.clh.spring.BeansException;
import com.clh.spring.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
