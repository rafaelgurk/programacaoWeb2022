package aula3;

import java.util.Date;

public class Testar {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Rafael", "000.111.222-33", new Date());
		aluno1.matricula = "32324545";
		
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Cpf: " + aluno1.cpf);
		System.out.println("Data de nascimento: " + aluno1.data_nascimento.toString());
		System.out.println("Matrícula: " + aluno1.matricula);
	}
}
