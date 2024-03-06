package geometric;

public class Square implements GeometricFigure {
	private int lado;
	
	// Constructor
	public Square(int lado) {
		super();
		this.lado = lado;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public int getArea() {
		int area = 0;
		area = lado * lado;
		return area;
	}
	
	@Override
	public int getPerimeter() {
		int perimeter = 0;
		perimeter = lado * 4;
		return perimeter;
	}
	
	@Override
	public String getShapeName() {
		return "Square";
	}
}
