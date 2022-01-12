package com.clh.spring.factory.config;

import com.clh.spring.PropertyValues;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class BeanDefinition {

    private final Class<?> beanClass;

    private final PropertyValues propertyValues;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
        propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class<?> beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues == null ? new PropertyValues() : propertyValues;

    }

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }
}
