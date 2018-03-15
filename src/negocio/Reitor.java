package negocio;

import java.util.List;

public class Reitor {

	private String nome;
	private List<Instituicao> instituicoes;
	
	public void exibir(){
		System.out.println("Nome: " + this.getNome());
		for (Instituicao instituicao : this.getInstituicoes()) {
			instituicao.exibir();
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Instituicao> getInstituicoes() {
		return instituicoes;
	}
	public void setInstituicoes(List<Instituicao> instituicoes) {
		this.instituicoes = instituicoes;
	}
}
