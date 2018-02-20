package testes;

import negocio.Cadastro;

public class TestaAlunoCadastro {

	public static void main(String[] args) {
		String[] nomes = {"Huguinho", "Zezinho", "Luizinho"};
		int[] anos = {1990, 2000, 2010};
		float[] mensalidades = {600, 500, 400};
		boolean[] bolsas = {false, false, true};
		
		// Instancie um objeto do tipo Cadastro
		Cadastro cadastro = new Cadastro();
		
		// Preencha os atributos com as variáveis
		cadastro.nomes = nomes;
		cadastro.anos = anos;
		cadastro.mensalidades = mensalidades;
		cadastro.bolsas = bolsas;
		
		// Chame os dez métodos criados
		
		//Quais os nomes dos alunos?
		cadastro.obterNomesAlunos(); 

		//Quais as idades dos alunos?
		cadastro.obterIdadesAlunos(); 
		
		//Qual o total pago com as mensalidades?
		cadastro.obterTotalMensalidades(); 
		
		//Quantos alunos são bolsistas?
		cadastro.obterQtdeBolsistas(); 
		
		//Qual o nome do aluno mais velho?
		cadastro.obterAlunoMaisVelho();
		
		//Quem paga mais caro?
		cadastro.obterAlunoMaiorMensalidade();
		
		//Temos quantos alunos?
		cadastro.obterQtdeAlunos();
		
		//Qual a média de idade?
		cadastro.obterMediaIdade();
		
		//Existe algum aluno chamado 'zezinho'
		cadastro.existeAlunoZezinho();
		
		//Qual a média de mensalidade?
		cadastro.obterMediaMensalidade();
	}
}