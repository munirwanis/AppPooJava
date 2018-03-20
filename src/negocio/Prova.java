package negocio;

import java.util.List;

public class Prova {
	private Disciplina disciplina;
	private String nome;
	private float notaTrabalho;
	private List<Float> notasProva;
	
	public String obterRegistro() {
		return String.format(
				"%s;%s;%.2f;\r\n",
				this.getDisciplina().getDescricao(),
				this.getNome(),
				this.calcularMedia()
				);
	}
	
	public void exibir(){
		System.out.printf("O aluno %s tem média %.2f\n",
				this.getNome(),
				this.calcularMedia()
				);
	}	
	private float calcularMedia(){
		float media = this.getNotaTrabalho();
		
		for (Float nota : this.getNotasProva()) {
			media = media + nota;
		}		
		return media;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	public List<Float> getNotasProva() {
		return notasProva;
	}
	public void setNotasProva(List<Float> notasProva) {
		this.notasProva = notasProva;
	}
}