package com.springDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)//object is the one that is created and arg1 is the name of the bean.
			throws BeansException {
		System.out.println("In after initialization method. Bean name is " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In before initialization method. Bean name is " + beanName);
		return bean;
	}

	
}
