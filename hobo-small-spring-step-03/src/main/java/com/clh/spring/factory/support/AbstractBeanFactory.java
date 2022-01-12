package com.clh.spring.factory.support;

import com.clh.spring.BeansException;
import com.clh.spring.factory.config.BeanDefinition;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name, args);

    }

    @Override
    public Object getBean(String name) {
        return doGetBean(name, null);
    }

    protected Object doGetBean(final String name, final Object[] args) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition,  Object[] args) throws BeansException;

}
