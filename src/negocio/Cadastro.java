package negocio;

import java.util.List;

public class Cadastro {
	private List<String> nomes;
	private List<Integer> anos;
	private List<Float> mensalidades;
	private List<Boolean> bolsas;

	public void obterNomesAlunos(){
		System.out.println("# Quais os nomes dos alunos?");
		
		for (String nome : this.nomes) {
			System.out.println(nome);
		}
	}
	
	public void obterIdadesAlunos(){
		System.out.println("# Quais as idades dos alunos?");
		
		for (int ano : this.anos) {
			System.out.println(this.obterIdade(ano));
		}
	}
	
	private int obterIdade(int anoNascimento){
		return 2018 - anoNascimento;
	}
	
	public void obterTotalMensalidades(){
		System.out.println("# Qual o total pago com as mensalidades?");
		
		float soma = 0;
		
		for (float mensalidade : this.mensalidades) {
			soma = soma + mensalidade;
		}
		
		System.out.println(soma);
	}
	
	public void obterQtdeBolsistas(){
		System.out.println("# Quantos alunos são bolsistas?");
		
		int qtdeBolsistas = 0;
		
		for (boolean bolsista : this.bolsas) {
			if(bolsista){
				qtdeBolsistas = qtdeBolsistas + 1;
			}
		}
		
		System.out.println(qtdeBolsistas);
	}

	public void obterAlunoMaisVelho(){
		System.out.println("# Qual o nome do aluno mais velho?");
		
		String alunoMaisVelho = null;
		int maiorIdade = 0;
		int idade = 0;
		
		for (int i = 0; i < nomes.size(); i++) {
			
			idade = this.obterIdade(anos.get(i));
			
			if(idade >= maiorIdade){
				maiorIdade = idade;
				alunoMaisVelho = nomes.get(i);
			}
		}
		
		System.out.println(alunoMaisVelho);
	}
	
	public void obterAlunoMaiorMensalidade(){
		System.out.println("# Quem paga mais caro?");
		
		String alunoPagaMais = null;
		float maiorMensalidade = 0;
		
		for (int i = 0; i < nomes.size(); i++) {
			
			if(mensalidades.get(i) >= maiorMensalidade){
				maiorMensalidade = mensalidades.get(i);
				alunoPagaMais = nomes.get(i);
			}
		}
		
		System.out.println(alunoPagaMais);		
	}
	
	public void obterQtdeAlunos(){
		System.out.println("# Temos quantos alunos?");
		
		System.out.println(this.nomes.size());
	}
	
	public void obterMediaIdade(){
		System.out.println("# Qual a média de idade?");
		
		float somaIdade = 0;
		
		for (int ano : this.anos) {
			somaIdade = somaIdade + this.obterIdade(ano);
		}
		
		System.out.println(somaIdade / this.anos.size());
	}
	
	public void existeAlunoZezinho(){
		System.out.println("# Existe algum aluno chamado 'zezinho'?");

		String nomeBusca = "zezinho";
		
		boolean existeNomeBusca = false;
		
		for (String nome : this.nomes) {
			
			if(nomeBusca.equals(nome.toLowerCase())){
				existeNomeBusca = true;
			}			
		}
		
		System.out.println(existeNomeBusca ? "sim" : "não");		
	}
	
	public void obterMediaMensalidade(){
		System.out.println("# Qual a média de mensalidade?");
		
		float somaMensalidade = 0;
		
		for (float valor : this.mensalidades) {
			somaMensalidade = somaMensalidade + valor;
		}
		
		System.out.println(somaMensalidade / this.mensalidades.size());
	}

	public List<String> getNomes() {
		return nomes;
	}
	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}
	public List<Integer> getAnos() {
		return anos;
	}
	public void setAnos(List<Integer> anos) {
		this.anos = anos;
	}
	public List<Float> getMensalidades() {
		return mensalidades;
	}
	public void setMensalidades(List<Float> mensalidades) {
		this.mensalidades = mensalidades;
	}
	public List<Boolean> getBolsas() {
		return bolsas;
	}
	public void setBolsas(List<Boolean> bolsas) {
		this.bolsas = bolsas;
	}	
}