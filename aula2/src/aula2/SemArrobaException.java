package aula2;

public class SemArrobaException extends Exception {
	@Override
	public String getMessage() {
		return "Caractere @ n�o encontrado no e-mail!!";
	}
}
