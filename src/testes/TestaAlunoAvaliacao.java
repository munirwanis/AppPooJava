package testes;

import negocio.Aluno;

public class TestaAlunoAvaliacao {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();		
		aluno.nome = "Aluno";
		aluno.anoNascimento = 1990;		
		aluno.mensalidade = 1000;	
		aluno.bolsista = false;		
		aluno.exibir(args);
		
	}
}
