package exercicio2;

import java.util.Date;
import java.util.Scanner;

/*
Requisitos:
• Mínimo 5 classes
• Deve ter pelo menos uma ocorrência de herança múltipla
• Criar pelo menos uma instancia de cada objeto/classe que possa ser 
serializada
*/


// super class
public class Banda extends Integrante implements Instrumentos, AgendaShows {
	Scanner scan = new Scanner(System.in);
	public String estiloMusical;
	public String nickname;
	public Boolean temOnibus;
	
	public String material;
	public String modelo;

	
	// Constructor
	public Banda(String _estiloMusical, String _nickname, Boolean _temOnibus, String _nome, String _funcao, int _anoContrato) {
		super(_nome, _funcao, _anoContrato);
		this.estiloMusical = _estiloMusical;
		this.nickname = _nickname;
		this.temOnibus = _temOnibus;
	}
	
	// Override interface Instrumentos 
	@Override
	public String getMaterial() {
		System.out.print("Material do instrumento: ");
		material = scan.nextLine();
		return material;
	}
	@Override
	public String getModelo() {
		System.out.print("Modelo do instrumento: ");
		modelo = scan.nextLine();
		return modelo;
	}
	
	// Override interface AgendaShows
	@Override
	public Date getDataShow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCidade() {
		// TODO Auto-generated method stub
		return null;
	}
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
