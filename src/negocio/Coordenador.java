package negocio;

import java.util.List;

public class Coordenador {

	private String nome;
	private List<Curso> cursos;
	
	public void exibir(){
		System.out.println("Nome: " + this.getNome());
		for (Curso curso : this.getCursos()) {
			curso.exibir();
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
