package com.johnson.spring6webappdi.spring6di.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, BeanPostProcessor {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    private String javaVer;

    @Value("${java.specification.version}")
    public void setJavaVer(String javaVer) {
        this.javaVer = javaVer;
        System.out.println("## 1 The LifeCycleDemoBean has its javaVer set" + this.javaVer);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## 2 My Bean Name is: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## 8 The LifeCycleDemoBean has been terminated");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## 7 The LifeCycleDemoBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## 6 The LifeCycleDemoBean has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## 3 BeanFactory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## 4 ApplicationContext has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## 5 The Post Construct annotated method has been called");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## postProcessBeforeInitialization - Called by Bean Post Processor");

        if(bean instanceof LifeCycleDemoBean lifeCycleDemoBean){
            System.out.println("Calling beforeInit");
            lifeCycleDemoBean.beforeInit();
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("## postProcessAfterInitialization - Called by Bean Post Processor");

        if(bean instanceof LifeCycleDemoBean lifeCycleDemoBean){
            System.out.println("Calling afterInit");
            lifeCycleDemoBean.afterInit();
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
