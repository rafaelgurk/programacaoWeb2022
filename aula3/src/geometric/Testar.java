package geometric;

public class Testar {
	public static void main(String[] args) {
		
		// Square
		Square quadrado = new Square(3);
		System.out.println(quadrado.getShapeName());
		System.out.println("Area do quadrado: " + quadrado.getArea());
		System.out.println("Perimetro do quadrado: " + quadrado.getPerimeter());

		
		// Triangle(base, altura, ladoA, ladoB, ladoC)
		Triangle triangulo = new Triangle(5, 6, 3, 4, 5);
		System.out.println("\n" + triangulo.getShapeName());
		System.out.println("Area do triangulo: " + triangulo.getArea());
		System.out.println("Perimetro do triangulo: " + triangulo.getPerimeter());
		
		
		// Circle(pi, raio)
		Circle circulo = new Circle(Math.PI, 9);
		System.out.println("\n" + circulo.getShapeName());
		System.out.println("Area do circulo: " + circulo.getArea());
		System.out.println("Circunferencia do circulo: " + circulo.getPerimeter());

	}
}
