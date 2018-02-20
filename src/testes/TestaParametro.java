package testes;

public class TestaParametro {

	public static void main(String[] args) {

		String nome = args[0];		
		int anoNascimento = Integer.valueOf(args[1]);		
		float mensalidade = Float.valueOf(args[2]);	
		boolean bolsista = Boolean.valueOf(args[3]);
		
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
