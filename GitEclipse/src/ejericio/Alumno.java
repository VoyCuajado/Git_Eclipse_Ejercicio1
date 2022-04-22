package ejericio;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	
	public Alumno(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	
	public String toString() {
		return "DNI: "+ this.dni +"NOMBRE: "+ this.nombre +" - APELLIDO: "+ this.apellido;
		
	}
}
