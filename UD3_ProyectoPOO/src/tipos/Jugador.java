package tipos;

import java.util.Objects;

public class Jugador {
	private String dni;
	private String nombre;
	private Posicion posicion;
	public Jugador(String dni, String nombre, Posicion posicion) {
		this.dni = dni;
		this.nombre = nombre;
		this.posicion = posicion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(dni, other.dni);
	}
	
	

}
