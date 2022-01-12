package com.clh.spring;

import com.clh.spring.factory.config.BeanDefinition;
import com.clh.spring.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author: LongHua
 * @date: 2022/1/12
 */
public class FactoryTest02 {

    @Test
    public void test() {

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService", "hobo");
        userService.print();

    }

    public static class UserService {
        String name;

        public UserService(String name) {
            this.name = name;
        }

        public void print() {
            System.out.println("hello spring " + name);
        }
    }
}
