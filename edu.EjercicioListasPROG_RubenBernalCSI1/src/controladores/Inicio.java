/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import dtos.EstudianteDto;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 141224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 141224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo un objeto estudiante
		EstudianteDto estudiante = new EstudianteDto();
		
		//Creo el ArrayList
		ArrayList<EstudianteDto> lista = new ArrayList<EstudianteDto>();
		
		//Añado 5 estudiantes a la lista
		lista.add(new EstudianteDto("Ruben", "30279024F", "1988/05/11"));
		lista.add(new EstudianteDto("Carlos", "30265424D", "1996/03/22"));
		lista.add(new EstudianteDto("Francisco", "54956321T", "1989/12/07"));
		lista.add(new EstudianteDto("Carmen", "85749213H", "1997/10/04"));
		lista.add(new EstudianteDto("Susana", "56894512K", "1995/11/20"));
		
		//Imprimo la lista completa
		for(EstudianteDto estud : lista){
			System.out.println("Nombre: " + estud.getNombre() + "  Dni: " + estud.getDni() + "  Fecha de Nacimiento: " + estud.getFechaNacimiento());
		}
		
		//Modifico uno de los elementos de la lista
		lista.set(4, new EstudianteDto("Veronica", "45956321G", "1983/09/15"));
		
		//Elimino uno de los estudiantes por su nombre
		lista.remove("Francisco");
		
		//Busco un estudiante especifico por su dni
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el Dni: ");
		String dni = sc.next();
		for(EstudianteDto estud : lista){
			if(estud.getDni().equals(dni)) {
				System.out.println("Nombre: " + estud.getNombre() + "  Dni: " + estud.getDni() + "  Fecha de Nacimiento: " + estud.getFechaNacimiento());
			}
		}
		sc.close();
		
		//Muestro el nombre del estudiante de la tercera posicion de la lista
		System.out.println("Nombre del tercer estudiante de la lista: " + lista.get(2).getNombre());
		
		//Elimino un estudiante mas y muestro el tamaño de la lista
		lista.remove(0);
		System.out.println("Tamaño de la lista: " + lista.size());
		
		//Muestro el índice del estudiando de menor edad, trabajando con sus fechas de nacimiento
		 Collections.sort(lista, Comparator.comparing(EstudianteDto::getFechaNacimiento));
		 System.out.println("Lista ordenada por edad del mas mayor al menor de todos:");
		 for(EstudianteDto estud : lista){
				System.out.println("Nombre: " + estud.getNombre() + "  Dni: " + estud.getDni() + "  Fecha de Nacimiento: " + estud.getFechaNacimiento());
		 }
		 System.out.println("El indice de la persona mas joven es: " + (lista.size()-1));

	}

}
