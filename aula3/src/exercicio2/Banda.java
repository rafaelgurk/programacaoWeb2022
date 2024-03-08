package exercicio2;

/*
Requisitos:
• Mínimo 5 classes
• Deve ter pelo menos uma ocorrência de herança múltipla
• Criar pelo menos uma instancia de cada objeto/classe que possa ser 
serializada
*/


// super class
public class Banda {
	public String estiloMusical;
	public String nome;
	public Boolean temOnibus;
	
	// Constructor
	public Banda(String _estiloMusical, String _nome, Boolean _temOnibus) {
		super();
		this.estiloMusical = _estiloMusical;
		this.nome = _nome;
		this.temOnibus = _temOnibus;
	}
	
	
//	// Getters e Setters
//	// id
//	public String getId() {
//		return estiloMusical;
//	}
//	public void setId(String _estiloMusical) {
//		this.estiloMusical = _estiloMusical;
//	}
//	
//	// nome
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String _nome) {
//		this.nome = _nome;
//	}
//	
//	// temOnibus
//	public Boolean getTemOnibus() {
//		return temOnibus;
//	}
//	public void setTemOnibus(Boolean _temOnibus) {
//		this.temOnibus = _temOnibus;
//	}
}
































