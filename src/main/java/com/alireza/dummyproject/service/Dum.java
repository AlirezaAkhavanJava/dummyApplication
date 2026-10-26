package com.alireza.dummyproject.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class Dum implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public void something() {
        System.out.println(Dum.class.getName());
    }

    public Dum() {
        System.out.println("There comes a lion");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("BEAN WITH IN FACTORY");
    }

    @Override
    public void setBeanName(String name) {
        name = name.toUpperCase();
        System.out.println(name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Nants ingonyama bagithi baba".toUpperCase());
    }
}
