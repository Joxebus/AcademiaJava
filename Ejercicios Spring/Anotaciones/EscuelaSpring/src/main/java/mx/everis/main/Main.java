package mx.everis.main;

import mx.com.everis.util.SpringUtil;
import mx.everis.beans.Alumno;
import mx.everis.beans.Materia;


//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringUtil.getContext();

        Alumno alumno = context.getBean("alumnoAcademia", Alumno.class);
        //alumno.setNombre("Omar");
        Materia materia = context.getBean("materia", Materia.class);
        materia.setNombre("Matematicas");
        alumno.agregarMateria(materia);

        materia = context.getBean("materia", Materia.class);
        materia.setNombre("Biologia");
        alumno.agregarMateria(materia);

        materia = context.getBean("materia", Materia.class);
        materia.setNombre("Ciencias Naturales");
        alumno.agregarMateria(materia);

        materia = context.getBean("materia", Materia.class);
        materia.setNombre("Historia");
        alumno.agregarMateria(materia);

        //System.out.println(alumno);
        //System.out.println(alumno.getMaterias().getClass().getName());
        context.close();
    }

}
