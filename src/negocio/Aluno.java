package negocio;

import java.util.Set;

public class Aluno {
	
	private String nome;		
	private int anoNascimento;		
	private float mensalidade;	
	private boolean bolsista;
	private Endereco endereco;
	private Universidade universidade;
	private Set<Avaliacao> avaliacoes;
	
	public Aluno(){
		this.nome = "Aluno desconhecido";		
		this.anoNascimento = 2018;		
		this.mensalidade = 999;	
		this.bolsista = true;
	}

	public Aluno(String nome){
		this();
		this.nome = nome;
	}
	
	public Aluno(String nome, int anoNascimento){
		this(nome);
		this.anoNascimento = anoNascimento;
	}
	
	public Aluno(String nome, int anoNascimento, float mensalidade){
		this(nome, anoNascimento);
		this.mensalidade = mensalidade;
	}
	
	public Aluno(String nome, int anoNascimento, float mensalidade, Endereco endereco){
		this(nome, anoNascimento, mensalidade);
		this.endereco = endereco;
	}
	
	public Aluno(String nome, int anoNascimento, float mensalidade, Endereco endereco, Universidade universidade){
		this(nome, anoNascimento, mensalidade, endereco);
		this.universidade = universidade;
	}
	
	public Aluno(String nome, int anoNascimento, float mensalidade, boolean bolsista){
		this(nome, anoNascimento, mensalidade);
		this.bolsista = bolsista;
	}
	
	public String obterRelatorio(){
		return String.format(
				  "Nome: %s; "
				+ "Nascimento: %d; "
				+ "Mensalidade: %.2f; "
				+ "Bolsista: %s\n", 
				this.nome, 
				this.anoNascimento, 
				this.mensalidade,
				this.bolsista ? "sim" : "não"
				);
	}

	public void exibir(){
		System.out.printf(this.obterRelatorio());

		if(this.getEndereco() != null){
			this.getEndereco().exibir();
		} else {
			System.out.println("Não existe endereço associado!");
		}
		
		if(this.getUniversidade() != null){
			this.getUniversidade().exibir();
		} else {
			System.out.println("Não existe universidade associada!");
		}

		if(this.getAvaliacoes() != null){

			for (Avaliacao avaliacao : this.getAvaliacoes()) {
				avaliacao.exibir();
			}

		} else {
			System.out.println("Não existem avaliações associadas!");
		}
		
	}
	
	public void exibir(boolean bolsista){
		this.bolsista = bolsista;
		
		this.exibir();
	}
	
	public void exibir(String[] notas){
		
		this.exibir();
		
		System.out.printf("Média = %.2f", this.calcularMedia(notas));
	}
	
	private float calcularMedia(String[] notas){
		float media = 0;
		
		for (String nota : notas) {
			media = media + Float.valueOf(nota);
		}
		
		return media / notas.length;		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoNascimento;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (anoNascimento != other.anoNascimento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Universidade getUniversidade() {
		return universidade;
	}
	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	public Set<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(Set<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}	
}