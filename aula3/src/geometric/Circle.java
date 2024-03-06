package geometric;

public class Circle implements GeometricFigure {
	double pi;
	double raio;
	
	// Constructor
	public Circle(double pi, double raio) {
		super();
		this.raio = raio;
		this.pi = pi;
	}
	
	
	// get-set pi
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}

	// get-set raio
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	// Override methods
	@Override
	public String getShapeName() {
		return "Circle";
	}
	@Override
	public int getArea() {
		int area = 0;
		area = (int) (pi * (Math.pow(raio, 2)));
		return area;
	}
	@Override
	public int getPerimeter() {
		int perimeter = 0;
		perimeter = (int) (2 * pi * raio); 
		return perimeter;
	}
}
