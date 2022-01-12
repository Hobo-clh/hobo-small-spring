package com.clh.spring.factory.support;

import com.clh.spring.BeansException;
import com.clh.spring.factory.config.BeanDefinition;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = this.getBeanDefinition(name);

        return this.createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
