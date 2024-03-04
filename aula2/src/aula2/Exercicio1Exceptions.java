package aula2;

public class Exercicio1Exceptions {
	
	public static void verificarValores(float num1, float num2) throws Exception {
		if(num1 < num2) { 
			throw new Exception("O primeiro valor deve ser maior que o segundo!"); 
		
		}
		
		if(num2 == 0) { 
			throw new Exception("Segundo número não pode ser 0!"); 
		}
	}
}
