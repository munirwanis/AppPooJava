package testes;

import negocio.Aluno;

public class TestaAlunoAvaliacao {

	public static void main(String[] args) {

		//instanciei um objeto
		Aluno aluno = new Aluno();
		
		//preenchendo as informações
		aluno.nome = args[0];
		aluno.anoNascimento = Integer.valueOf(args[1]);
		aluno.mensalidade = Float.valueOf(args[2]);
		aluno.bolsista = Boolean.valueOf(args[3]);
		
		//chamando o método exibir
		aluno.exibir(args);
	}
}
