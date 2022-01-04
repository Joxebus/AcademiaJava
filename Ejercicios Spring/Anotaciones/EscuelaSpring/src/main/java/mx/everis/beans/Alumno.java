package mx.everis.beans;

import java.beans.ConstructorProperties;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alumnoAcademia")

public class Alumno {

    private String nombre;

    private List<Materia> materias;

    @PostConstruct
    public void init() {
        if (materias.size() != 0) {
            materias.remove(0);
        }
    }

    public Alumno() {

    }

    @Autowired
    public Alumno(List<Materia> materias, @Value("Omar") String nombre) {
        this.materias = materias;
        this.nombre = nombre;
    }

    public void eliminandoSingleton() {
        System.out.println("Eliminando objeto " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }

    @PreDestroy
    public String toString() {
        String salida = "Nombre: " + nombre + "\n";
        salida += "::::::::::::::::::::::::::::::::::\n";
        for (Materia materia : materias) {
            if (materia != null)
                salida += materia + "\n";
        }
        System.out.println(salida);
        return salida;
    }
}
