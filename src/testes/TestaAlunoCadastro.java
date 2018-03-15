package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import negocio.Cadastro;

public class TestaAlunoCadastro {

	public static void main(String[] args) {
		String[] nomes = {"Huguinho", "Zezinho", "Luizinho"};
		List<String> listaNomes = new ArrayList<String>();
		listaNomes.addAll(Arrays.asList(nomes));
		
		Integer[] anos = {1990, 2000, 2010};
		List<Integer> listaAnos = new ArrayList<Integer>();
		listaAnos.addAll(Arrays.asList(anos));
		
		Float[] mensalidades = {600f, 500f, 400f};
		List<Float> listaMensalidades = new ArrayList<Float>();
		listaMensalidades.addAll(Arrays.asList(mensalidades));
		
		Boolean[] bolsas = {false, false, true};
		List<Boolean> listaBolsas = new ArrayList<Boolean>();
		listaBolsas.addAll(Arrays.asList(bolsas));
		
		// Instancie um objeto do tipo Cadastro
		Cadastro cadastro = new Cadastro();
		
		// Preencha os atributos com as variáveis
		cadastro.setNomes(listaNomes);
		cadastro.setAnos(listaAnos);
		cadastro.setMensalidades(listaMensalidades);
		cadastro.setBolsas(listaBolsas);
		
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