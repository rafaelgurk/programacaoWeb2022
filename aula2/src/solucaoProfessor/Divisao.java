package solucaoProfessor;

import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float F1, F2, F; // float
		int i, I1, I2; // inteiro
		System.out.println("Este programa divide F1 por F2\n");
		System.out.println("Informe o primeiro n�mero> ");
		F1 = scan.nextFloat();
		System.out.println("Informe o segundo n�mero> ");
		F2 = scan.nextFloat();
		
		F = divisaoFloat(F1, F2);
		System.out.printf("\nResultado da divis�o float> %f", F);
		
		I1 = (int) F1;
		I2 = (int) F2;
		i = divisaoInteira(I1, I2);
		System.out.printf("\nResultado da divis�o inteira> %d", i);
		
		try {
			checaNumeros(F1, F2);
		}
		catch (NumeroMenorException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void checaNumeros(float n1, float n2) throws NumeroMenorException {
		if(n1 < n2) { 
			throw new NumeroMenorException();
		}
	}
	
	
	public static float divisaoFloat(float x, float y) {
		float r;
		try {
			r = x / y;
		} catch (ArithmeticException e) {
			System.out.println("\nDivis�o float: Ocorreu divis�o por zero");
			r = 0;
		}
		
		return r;
	}
	
	
	public static int divisaoInteira(int x, int y) {
		int r;
		try {
			r = x / y;
		} catch (ArithmeticException e) {
			System.out.println("\nDivis�o int: Ocorreu divis�o por zero");
			r = 0;
		}
		
		return r;
	}
}
















