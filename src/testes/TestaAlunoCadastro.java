package testes;

import negocio.Cadastro;

public class TestaAlunoCadastro {

	public static void main(String[] args) {

		String[] nomes = {"Huginho", "Zezinho", "Luizinho"};
		int[] anos = {1990, 2000, 2010};
		float[] mensalidades = {600, 500, 400};
		boolean[] bolsas = {false, false, true};
		
		Cadastro cadastro = new Cadastro(nomes, anos, mensalidades, bolsas);
		
		cadastro.alunoMaisVelho();
		cadastro.exibirIdade();
		cadastro.exibirNomes();
		cadastro.existeZezinho();
		cadastro.mediaIdade();
		cadastro.mediaMensalidades();
		cadastro.pagaMaisCaro();
		cadastro.quantidadeAlunos();
		cadastro.quantidadeAlunosBolsistas();
		cadastro.totalPagoMensalidade();
	}
}
