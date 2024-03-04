package aula2;

public class ExemploExcecao {

//	try { 
//		// primeiro código a tentar ser executado
//	} 
//	catch(tipo_excecao_1 e) { primeiro tratamento de excecao }
//	catch(tipo_excecao_2 e) { segundo tratamento de excecao  } 
//	catch(tipo_excecao_n e) { ... }
//	}
	
	public static void main(String args[]) {
		String frase = null;
		String novaFrase = null;
		
		try { 
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e) { 
			System.out.println("A frase está vazia, atribuído valor default!");
			frase = "Frase Vazia";
		}
		finally { 
			novaFrase = frase.toUpperCase();			
		}
		
		System.out.println("Frase antiga: " + frase);
		System.out.println("Frase atualizada: " + novaFrase);
	}
}