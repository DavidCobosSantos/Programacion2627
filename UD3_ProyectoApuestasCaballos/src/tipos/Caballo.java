package tipos;

public class Caballo {
	private final String id;
	private String nombre;
	private Raza raza;
	private Integer victorias;
	private Double velocidad;
	public Caballo(String id, String nombre, Raza raza, Double velocidad) {
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.victorias = 0;
		this.velocidad = velocidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public Integer getVictorias() {
		return victorias;
	}
	public void setVictorias(Integer victorias) {
		this.victorias = victorias;
	}
	public Double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Caballo [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", victorias=" + victorias
				+ ", velocidad=" + velocidad + ", getNombre()=" + getNombre() + ", getRaza()=" + getRaza()
				+ ", getVictorias()=" + getVictorias() + ", getVelocidad()=" + getVelocidad() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

	
	
}
