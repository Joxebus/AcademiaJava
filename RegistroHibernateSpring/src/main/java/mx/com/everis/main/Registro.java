package mx.com.everis.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.context.ApplicationContext;

import mx.com.everis.entity.AutoEntity;
import mx.com.everis.entity.PersonaEntity;
import mx.com.everis.service.OperacionesCRUD;
import mx.com.everis.util.FileUtil;
import mx.com.everis.util.SpringUtil;

public class Registro {

	public static void main(String[] args) {
		new Registro().config();
		// Lógica de la aplicación
	}
	
	public void config(){
		ApplicationContext context = SpringUtil.getContext();
		OperacionesCRUD<PersonaEntity> crud = (OperacionesCRUD<PersonaEntity>) context.getBean("crud");
		System.out.println("Se carga la base de datos");
		FileUtil archivo = new FileUtil("personas.txt");
		for(String nombre : archivo.readAllLines()){
			String datos[] = nombre.split(" ");
			crud.create((PersonaEntity)context.getBean("persona", datos[0], datos[1], datos[2]));
		}
		
		
		System.out.println("Termina la carga de la BD");
	}

}
