// Collections

import java.util.*;

// Lectura de archivos
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class UsoDeCollections {

    public static void main(String... args) {
        Map<String, List<String>> escuela = new HashMap<String, List<String>>();
        List<String> alumnos;
        Set<String> materias = new HashSet<String>();

        FileReader fr = null;
        try {

            fr = new FileReader(new File("Alumnos.txt"));
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            System.out.println("Se inicia el registro de materias y alumnos");
            while (linea != null) {
                if (linea.contains("-")) {
                    String materia = linea.substring(1);
                    alumnos = new ArrayList<String>();
                    linea = br.readLine();
                    while (linea != null && !(linea.contains("-"))) {
                        alumnos.add(linea);
                        linea = br.readLine();
                    }
                    materias.add(materia);
                    escuela.put(materia, alumnos);
                }
            }

        } catch (IOException ioe) {
            System.out.println("Ocurrio un error mientras se leía el archuivo");
        }

        System.out.println("Se listan las materias con sus alumnos");
        for (String materia : materias) {
            alumnos = escuela.get(materia);
            System.out.println("::::::::" + materia + "::::::::");
            for (String alumno : alumnos) {
                System.out.println(alumno);
            }
        }

    }
}
