package com.clh.spring;

import org.junit.Test;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class FactoryTest01 {

    @Test
    public void test() {
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.print();
    }

    public static class UserService {
        public void print() {
            System.out.println("hello com.clh.spring");
        }
    }
}
