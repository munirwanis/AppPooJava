package testes;

//http://www.dontpad.com/apppoojava

public class TestaInformacao {

	public static void main(String[] args) {
		
		String nome = "Elberth Moraes";		
		int anoNascimento = 1978;		
		float mensalidade = 2000;		
		boolean bolsista = false;
		
		System.out.printf(
				  "Nome: %s; "
				+ "Nascimento: %d; "
				+ "Menalidade: %.2f; "
				+ "Bolsista: %s", 
				nome, 
				anoNascimento, 
				mensalidade,
				bolsista ? "sim" : "não"
			);		
	}
}
