package com.clh.spring.factory.config;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
