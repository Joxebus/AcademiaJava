package mx.com.everis.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	
	private static SessionFactory buildSessionFactory(){
		try{			
			return new AnnotationConfiguration().configure().buildSessionFactory(); 
		}catch(Throwable ex){
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return SESSION_FACTORY;
	}	

}
