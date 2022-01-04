package com.everis.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

    private static final ApplicationContext CONTEXT = buildContext();

    private static final ApplicationContext buildContext() {
        try {
            return new ClassPathXmlApplicationContext("applicationContext.xml");
        } catch (BeansException be) {
            System.out.println("Error al cargar la configuración de Spring");
            return null;
        }
    }

    public static ApplicationContext getContext() {
        return CONTEXT;
    }

}
