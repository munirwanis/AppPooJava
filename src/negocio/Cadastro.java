package negocio;

public class Cadastro {
	public String[] nomes;
	public int[] anos;
	public float[] mensalidades;
	public boolean[] bolsas;

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
		
		for (int i = 0; i < nomes.length; i++) {
			
			idade = this.obterIdade(anos[i]);
			
			if(idade >= maiorIdade){
				maiorIdade = idade;
				alunoMaisVelho = nomes[i];
			}
		}
		
		System.out.println(alunoMaisVelho);
	}
	
	public void obterAlunoMaiorMensalidade(){
		System.out.println("# Quem paga mais caro?");
		
		String alunoPagaMais = null;
		float maiorMensalidade = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			
			if(mensalidades[i] >= maiorMensalidade){
				maiorMensalidade = mensalidades[i];
				alunoPagaMais = nomes[i];
			}
		}
		
		System.out.println(alunoPagaMais);		
	}
	
	public void obterQtdeAlunos(){
		System.out.println("# Temos quantos alunos?");
		
		System.out.println(this.nomes.length);
	}
	
	public void obterMediaIdade(){
		System.out.println("# Qual a média de idade?");
		
		float somaIdade = 0;
		
		for (int ano : this.anos) {
			somaIdade = somaIdade + this.obterIdade(ano);
		}
		
		System.out.println(somaIdade / this.anos.length);
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
		
		System.out.println(somaMensalidade / this.mensalidades.length);
	}
}