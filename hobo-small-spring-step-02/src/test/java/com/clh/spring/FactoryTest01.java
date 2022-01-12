package com.clh.spring;

import com.clh.spring.factory.config.BeanDefinition;
import com.clh.spring.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class FactoryTest01 {

    @Test
    public void test() {

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.print();

        UserService userService2 = (UserService) beanFactory.getBean("userService");
        if (userService2 == userService) {
            System.out.println("userService2 == userService");
        }
    }

    public static class UserService {
        public void print() {
            System.out.println("hello spring");
        }
    }
}
