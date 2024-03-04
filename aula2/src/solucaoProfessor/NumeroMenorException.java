package solucaoProfessor;

import java.util.Scanner;

public class NumeroMenorException extends Exception {
	public NumeroMenorException() {
		super("\nSegundo número não pode ser menor que o primeiro!!");
	}
}
