/*
Requisitos:
• Mínimo 5 classes
• Deve ter pelo menos uma ocorrência de herança múltipla
• Criar pelo menos uma instancia de cada objeto/classe que possa ser 
serializada
*/


package exercicio2;

public class Main {
	
	public static void main(String[] args) {
		// String _estiloMusical, String _nickname, Boolean _temOnibus, String _nome, String _funcao, int _anoContrato
		Banda banda1 = new Banda("Rockinho Band", "Rock", true, "Rafael", "Violonista", 2024);
		System.out.println("Nome da Banda: " + banda1.nickname);
		System.out.println("Estilo da banda: " + banda1.estiloMusical);
		System.out.println("Possui Onibus próprio? " + banda1.temOnibus);
		System.out.println("Integrante: " + banda1.nome);
		System.out.println("Funcao do integrante: " + banda1.funcao);
		System.out.println("Ano de contrato: " + banda1.anoContrato);
		
		System.out.println(banda1.getMaterial());
		System.out.println(banda1.getModelo()); 
	}
}
