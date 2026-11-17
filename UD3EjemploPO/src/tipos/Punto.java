package tipos;

public class Punto {
	private Double x;
	private Double y;

//Constructor por parámetros
	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
//Constructor por defecto	
//	public Punto() {
//		this.x = 0.0;
//		this.y = 0.0;
//	}

	public Punto() {
		this(0.0, 0.0);
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
	// distancia entre 2 puntos????
//	public Integer distancia() {
//		return distancia;
//	}

	public Double distanciaA(Punto p) {
		Double catx = this.getX() - p.getX();
		Double caty = this.getY() - p.getY();
		return Math.sqrt(catx * catx + caty * caty);
	}
}
