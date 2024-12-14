/**
 * Ruben Bernal Ramos, CSI1
 */

package dtos;

public class EstudianteDto {

	//Atributos
	String nombre;
	String dni;
	String fechaNacimiento;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Constructores
	public EstudianteDto(String nombre, String dni, String fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public EstudianteDto() {
		
	}
}
