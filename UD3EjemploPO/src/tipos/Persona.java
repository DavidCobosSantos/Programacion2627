package tipos;

public class Persona {
	
	//atributos (o campos) de la clase persona
	//explicacion de para que se pone private y no public(para que no sea tan accesible cambiarlo, asi con un setter se pueden poner condiciones al ser un método)
	private String nombre;
	private Integer edad;
	private Double peso;
	private Sexo sexo;
	
	//constructor, se hace con click derecho-->source-->generate constructor using fields
	public Persona(String nombre, Integer edad, Double peso, Sexo sexo) {
		if (edad<0) {
			throw new IllegalArgumentException("Illoooooo esa edad!!!!");
		}
		/*aquí hay que poner si o si el this para el atributo*/
		this.nombre /*atributo*/= nombre;//parametro
		this.edad = edad;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	//getters y setters, se hace con click derecho-->source-->generate getters and setters
	//setters o modificadores
	//getters o
	public String getNombre() {
		/*aqui el this es para dar enfasis, se puede o no poner*/
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		if (edad<0) {
			throw new IllegalArgumentException("Illoooooo esa edad!!!!");
		}
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	//metodo toString, es el metodo padre de todo objeto, por eso da una direccion si no se indica lo contrario
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad= " + edad + ", peso=" + peso + ", sexo=" + sexo + "]";
	}
	
}
