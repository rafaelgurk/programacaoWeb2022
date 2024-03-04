package aula2;

public class ExemploExcecaoArroba {
	public static void main(String[] args) throws SemArrobaException {
		String email = "aluno" + "@" + "gmail.com";
		
		if(!email.contains("@")) {
			throw new SemArrobaException();
		}
		else {
			System.out.println("Email correto: " + email);
		}
	}
}
