package solucaoProfessor;

import java.util.Scanner;

public class NumeroMenorException extends Exception {
	public NumeroMenorException() {
		super("\nSegundo n�mero n�o pode ser menor que o primeiro!!");
	}
}
