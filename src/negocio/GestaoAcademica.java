package negocio;

import java.util.List;

public class GestaoAcademica {

	private List<Aluno> alunos;
	private Aluno alunoDevedor;
	
	public void exibir(){
		
		float somaMensalidade = 0;
		int maiorAno = 0;
		boolean ehDevedor = false;
		
		for (Aluno a : alunos) {

			if(a.equals(alunoDevedor)){
				ehDevedor = true;
			}
			
			somaMensalidade = somaMensalidade + a.getMensalidade();
			
			if(a.getAnoNascimento() >= maiorAno){
				maiorAno = a.getAnoNascimento();
			}
			
			a.exibir();
		}
		
		System.out.println("Soma mensalidade = " + somaMensalidade);
		
		System.out.println("Maior ano de nascimento = " + maiorAno);
		
		System.out.println("Aluno devedor na lista? " + (ehDevedor ? "sim" : "não"));
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Aluno getAlunoDevedor() {
		return alunoDevedor;
	}
	public void setAlunoDevedor(Aluno alunoDevedor) {
		this.alunoDevedor = alunoDevedor;
	}	
}