/**
	*Clase principal Persona
	*
	*@author Hamza
	*@version 1.0
	*/
public class Persona {

	/**
	*Atributo de la clase Persona 
	*@see nombre
	*Establece el nombre
	*
	*/
	private String nombre;
	/**
	*Atributo de la clase Persona 
	*@see apellido
	*Establece el apellido
	*
	*/
	private String apellidos;
	/**
	*Atributo de la clase Persona 
	*@see dni
	*Establece el dni
	*
	*/
	private String dni;
	/**
	*Atributo de la clase Persona 
	*@see edad
	*Establece la edad
	*
	*/
	private int edad;
	/**
	*Atributo de la clase Persona 
	*@see telefono
	*Establece el telefono
	*
	*/
	private String telefono;
	
	/**
	*Getter sobre nombre de la clase Persona
	*
	*/
	public String getNombre() {
		return nombre;
	}
	
	/**
	*Setter sobre nombre de la clase Persona
	*
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	*Getter sobre apellido de la clase Persona
	*
	*/
	public String getApellidos() {
		return apellidos;
	}
	/**
	*Setter sobre apellido de la clase Persona
	*
	*/
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	*Getter sobre dni de la clase Persona
	*
	*/
	public String getDni() {
		return dni;
	}
	/**
	*Setter sobre dni de la clase Persona
	*
	*/
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	*Getter sobre edad de la clase Persona
	*
	*/
	public int getEdad() {
		return edad;
	}
	/**
	*Setter sobre edad de la clase Persona
	*
	*/
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	*Getter sobre telefono de la clase Persona
	*
	*/
	public String getTelefono() {
		return telefono;
	}
	/**
	*Setter sobre telefono de la clase Persona
	*
	*/
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	  
	/**
	*<H2>MÈtodo toString</H2>
	*Muestra los datos de persona
	*/
	@Override
	public String toString() {
		return "Nombre: " + this.nombre +" "+ this.apellidos + " , DNI: " + this.dni + " , " + this.edad + " a√±os" + " , Tlf: " + this.telefono + "} ";
	}
	
	
	
}
