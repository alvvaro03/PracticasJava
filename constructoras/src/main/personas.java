package main;

import java.security.PublicKey;

public class personas {
	
	private String nombre;
	private String apellido;
	private int DNI;
	private int telefono;
	private int edad;
	
	
		
			
	public personas (String _nombre, String _apellido) {
		
		this.nombre = _nombre;
		this.apellido = _apellido;
		
	}

	public personas (int _DNI, int _edad, int _telefono) {
		
		this.DNI = DNI;
		this.edad = edad;
		this.telefono = telefono;
		
	}
		
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public String getApellido() {
		
		return this.apellido;
		
	}
	
	public int getEdad() {
		
		return this.edad;
		
		
	}
		
	
	
}
