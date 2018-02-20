package negocio;

public class Cadastro {

	public Cadastro(String[] nomes, int[] anos, float[] mensalidades, boolean[] bolsas) {
		this.nomes = nomes;
		this.nascimentos = anos;
		this.mensalidades = mensalidades;
		this.bolsistas = bolsas;
	}

	public String[] nomes;		
	public int[] nascimentos;		
	public float[] mensalidades;	
	public boolean[] bolsistas;

	public void exibirNomes() {
		System.out.println("Quais os nomes dos alunos:");

		for (String nome: this.nomes) {
			System.out.println(nome);
		}
	}

	public void exibirIdade() {
		System.out.println("Quais as idades dos alunos?");

		for (int idade: this.nascimentos) {
			System.out.println(this.calcularIdade(idade));
		}
	}

	private int calcularIdade(int ano) {
		return 2018 - ano;
	}

	public void totalPagoMensalidade() {
		System.out.println("Qual o total pago com mensalidades?");

		float totalPago = 0;
		for (float mensalidade: this.mensalidades) {
			totalPago += mensalidade;
		}

		System.out.println(totalPago);
	}

	public void quantidadeAlunosBolsistas() {
		System.out.println("Quantos alunos são bolsitas?");

		int total = 0;
		for (Boolean bolsa: this.bolsistas) {
			total = bolsa ? total + 1 : total + 0;
		}
		System.out.println(total);
	}

	public void alunoMaisVelho() {
		System.out.println("Qual o nome do aluno mais velho?");

		String alunoMaisVelho = null;
		int maiorIdade = 0;
		for (int i = 0; i < this.nascimentos.length; i++) {
			int idade = this.calcularIdade(this.nascimentos[i]);
			if (idade >= maiorIdade) {
				maiorIdade = idade;
				alunoMaisVelho = this.nomes[i];
			}
		}

		System.out.println(alunoMaisVelho);
	}

	public void pagaMaisCaro() {
		System.out.println("Quem paga mais caro?");

		String pagaMaisCaro = null;
		int maiorMensalidade = 0;
		for (int i = 0; i < this.mensalidades.length; i++) {
			if (this.mensalidades[i] >= maiorMensalidade) {
				pagaMaisCaro = this.nomes[i];
			}
		}

		System.out.println(pagaMaisCaro);
	}

	public void quantidadeAlunos() {
		System.out.println("Temos quantos alunos?");
		System.out.println(this.nomes.length);		
	}

	public void mediaIdade() {
		System.out.println("Qual a média de idades?");
		int totalIdade = 0;
		for (int ano : this.nascimentos) {
			totalIdade += this.calcularIdade(ano);
		}
		System.out.println(totalIdade / this.nascimentos.length);
	}

	public void existeZezinho() {
		System.out.println("Existe algum aluno chamado Zezinho?");
		String nomeConvert = "";
		for (String nome : nomes) {
			nomeConvert = nome.toLowerCase();
			if (nomeConvert.contains("zezinho")) {
				System.out.println(nome);
			}
		}
	}
	
	public void mediaMensalidades() {
		System.out.println("Qual a média de mensalidade?");
		float totalMensalidades = 0;
		for (float mensalidades : this.mensalidades) {
			totalMensalidades += mensalidades;
		}
		System.out.println(totalMensalidades / this.mensalidades.length);
	}
}