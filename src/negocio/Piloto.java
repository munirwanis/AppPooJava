package negocio;

import java.util.List;

import parametros.IConstantes;

public class Piloto {
	private String nome;
	private List<Integer> posicoes;
	
	public void exibirCampos() {
		System.out.println(this.obterRelatorio());
	}

	public void setClassificacoes(List<Integer> posicoes) {
		this.posicoes = posicoes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterNome() {
		return this.nome;
	}
	
	public String obterRelatorio() {
		return String.format(
				"O piloto %s tem %d pontos",
				this.obterNome(),
				this.calcularPontuacao()
				);
	}
	
	private int calcularPontuacao() {
		int pontos = 0;
		for (int posicao : this.posicoes) {
			if (posicao > 0) {
				pontos += IConstantes.PONTUACAO[posicao - 1];				
			}
		}
		return pontos;
	}
}
