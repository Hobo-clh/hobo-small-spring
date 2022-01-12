package com.clh.spring.factory.support;

import com.clh.spring.BeansException;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public interface BeanFactory {


    public Object getBean(String name) throws BeansException;

    public Object getBean(String name, Object... args) throws BeansException;

}
