package negocio;

public class GestaoAcademica {
	public Aluno[] alunos;
	public Aluno alunoDevedor;
	
	public void exibir() {
		float somaMensalidade = 0;
		int maiorAno = 0;
		boolean isAlunoDevedor = false;
		
		for (Aluno a : this.alunos) {
			if (a.equals(this.alunoDevedor)) {
				isAlunoDevedor = true;
			}
			
			somaMensalidade += a.mensalidade;
			
			if (a.anoNascimento > maiorAno) {
				maiorAno = a.anoNascimento;
			}
			a.exibir();
		}
		
		System.out.println("Soma mensalidade = " + somaMensalidade);
		System.out.println("Maior ano de nascimento = " + maiorAno);
		System.out.println("Aluno devedor está na lista? " + (isAlunoDevedor ? "Sim" : "Não"));
	}
}
