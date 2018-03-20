package negocio;

import java.util.List;

import parametros.IConstantes;

public class Piloto {

	private String nome;
	private List<Integer> classificacoes;
	
	public String obterRelatorio(){
		return String.format(
				"O piloto %s tem %d pontos\n",
				this.getNome(),
				this.calcularPontuacao()
				);
	}
	
	public void exibirCampos() {
		System.out.println(this.obterRelatorio());
	}
	
	private int calcularPontuacao(){
		int pontos = 0;
		for (Integer posicao : classificacoes) {
			if (posicao > 0){
				pontos = pontos + IConstantes.PONTUACAO[posicao-1];
			}
		}
		return pontos;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Integer> getClassificacoes() {
		return classificacoes;
	}
	public void setClassificacoes(List<Integer> classificacoes) {
		this.classificacoes = classificacoes;
	}
}
