package negocio;

public class Aluno {
	
	public String nome;		
	public int anoNascimento;		
	public float mensalidade;	
	public boolean bolsista;
	
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
	
	public Aluno(String nome, int anoNascimento, float mensalidade, boolean bolsista){
		this(nome, anoNascimento, mensalidade);
		this.bolsista = bolsista;
	}

	public void exibir(){
		System.out.printf(
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
		} else if (!nome.toLowerCase().equals(other.nome.toLowerCase()))
			return false;
		return true;
	}
	
	
}