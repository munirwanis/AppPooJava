package negocio;

public class Aluno {
	
	public Aluno() {
		this.nome = "Aluno desconhecido";
		this.anoNascimento = 2018;
		this.mensalidade = 999f;
		this.bolsista = true;
	}
	public Aluno(String nome) {
		this();
		this.nome = nome;
	}
	public Aluno(String nome, int anoNascimento) {
		this(nome);
		this.anoNascimento = anoNascimento;
	}
	public Aluno(String nome, int anoNascimento, float mensalidade) {
		this(nome, anoNascimento);
		this.mensalidade = mensalidade;
	}
	public Aluno(String nome, int anoNascimento, float mensalidade, Boolean bolsista) {
		this(nome, anoNascimento, mensalidade);
		this.bolsista = bolsista;
	}
	
	public String nome;		
	public int anoNascimento;		
	public float mensalidade;	
	public boolean bolsista;
	
	public void exibir(Boolean bolsista) {
		this.bolsista = bolsista;
		this.exibir();
	}
	
	public void exibir(String[] args) {
		int sum = 0;
		
		for (String arg: args) {
			sum += Integer.valueOf(arg);
		}
		
		Double finalNote = (double) (sum / args.length);
		System.out.printf("Media = " + finalNote);
	}
	
	public void exibir(){
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