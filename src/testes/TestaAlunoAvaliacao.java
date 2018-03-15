package testes;

import negocio.Aluno;

public class TestaAlunoAvaliacao {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();		
		aluno.setNome("Aluno");
		aluno.setAnoNascimento(1990);		
		aluno.setMensalidade(1000);	
		aluno.setBolsista(false);		
		aluno.exibir(args);
		
	}
}
