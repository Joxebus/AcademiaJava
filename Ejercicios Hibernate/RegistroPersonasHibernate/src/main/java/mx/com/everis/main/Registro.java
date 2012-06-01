package mx.com.everis.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import mx.com.everis.entity.AutoEntity;
import mx.com.everis.entity.PersonaEntity;
import mx.com.everis.service.OperacionesCRUD;

public class Registro {

	public static void main(String[] args) {
		OperacionesCRUD<PersonaEntity> crud = new OperacionesCRUD<PersonaEntity>();
		PersonaEntity persona = new PersonaEntity();
		
		List<PersonaEntity> listaPersonas = crud.list(persona);
		
		Collections.sort(listaPersonas);
		System.out.println("::::: Ordenados por naturalmente :::::");
		for(PersonaEntity p : listaPersonas){
			System.out.println(p);
		}
		
		System.out.println("::::: Ordenados por edad :::::");
		Collections.sort(listaPersonas, new Comparator<PersonaEntity>() {
			public int compare(PersonaEntity persona1, PersonaEntity persona2) {
				return persona1.getEdad() - persona2.getEdad();
			}
		});
		
		for(PersonaEntity p : listaPersonas){
			System.out.println(p);
		}
		
		//long id = Long.parseLong(JOptionPane.showInputDialog("Ingrese el id de la persona"));
		//persona.setId(id);
		//persona = crud.read(persona);
		
		/*String entrada[] = JOptionPane.showInputDialog("Ingrese los datos del auto").split(" ");		
		persona.addAuto(new AutoEntity(entrada));
		entrada = JOptionPane.showInputDialog("Ingrese los datos del auto").split(" ");
		persona.addAuto(new AutoEntity(entrada));
		crud.update(persona);
		Comparator<AutoEntity> ordenarPorModelo = new Comparator<AutoEntity>() {
			public int compare(AutoEntity auto1, AutoEntity auto2) {
				return auto1.getModelo().compareTo(auto2.getModelo());
			}
		};
		
		Collections.sort(persona.getAutos(),ordenarPorModelo);
		System.out.println(":::::::: Autos ordenados por marca ::::::::");
		for(AutoEntity auto : persona.getAutos()){
			System.out.println(auto);
		}*/
		
		
	}
	
	/*
	 * PersonaEntity persona;
		String entrada[] = JOptionPane.showInputDialog("Ingrese los datos de la persona").split(" ");		
		persona = new PersonaEntity(entrada);		
		
		entrada = JOptionPane.showInputDialog("Ingrese los datos del auto").split(" ");		
		persona.addAuto(new AutoEntity(entrada));
		entrada = JOptionPane.showInputDialog("Ingrese los datos del auto").split(" ");
		persona.addAuto(new AutoEntity(entrada));
		crud.create(persona);	
	 */

}
