package negocio;

import java.util.List;

public class Professor {

	private String nome;
	private List<Disciplina> disciplinas;
	
	public void exibir(){
		System.out.println("Nome: " + this.getNome());
		for (Disciplina disciplina : this.getDisciplinas()) {
			disciplina.exibir();
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}	
}
