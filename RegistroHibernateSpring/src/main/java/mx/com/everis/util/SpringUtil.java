package mx.com.everis.util;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtil {

    private static final ClassPathXmlApplicationContext CONTEXT = buildContext();

    private static final ClassPathXmlApplicationContext buildContext() {
        try {
            return new ClassPathXmlApplicationContext("ApplicationContext.xml");
        } catch (BeansException be) {
            throw new ExceptionInInitializerError(be);
        }
    }

    public static final ClassPathXmlApplicationContext getContext() {
        return CONTEXT;
    }

}
