package geometric;

public class Triangle implements GeometricFigure {
	private int base;
	private int altura;
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	// Constructor
	public Triangle(int base, int altura, int ladoA, int ladoB, int ladoC) {
		super();
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	// get-set to base
	public int getBase() {
		base = ladoC;
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
	// get-set to altura
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//get-set to ladoA
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	
	//get-set to ladoB
	public int getLadoB() {
		return ladoB;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	
	//get-set to ladoC
	public int getLadoC() {
		return ladoC;
	}
	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	
	//Override interface methods
	@Override
	public String getShapeName() {
		return "Triangle";
	}
	@Override
	public int getArea() {
		int area = 0;
		area = (base*altura) / 2;
		return area;
	}
	@Override
	public int getPerimeter() {
		int perimeter = 0;
		perimeter = ladoA + ladoB + ladoC;
		return perimeter;
	}
}








