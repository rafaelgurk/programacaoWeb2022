package aula2;

public class SemArrobaException extends Exception {
	@Override
	public String getMessage() {
		return "Caractere @ não encontrado no e-mail!!";
	}
}
