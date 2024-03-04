package aula2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro n�mero: ");
		float num1 = scan.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		float num2 = scan.nextInt();
		
		try {
			Exercicio1Exceptions.verificarValores(num1, num2);
			System.out.println("N�meros verificados e validados!");
			System.out.println(num1 + " / " + num2);
			System.out.printf("%.2f", num1/num2);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
