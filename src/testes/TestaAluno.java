package testes;

import negocio.Aluno;

public class TestaAluno {

	public static void main(String[] args) {

		//instanciei um objeto
		Aluno aluno = new Aluno();
		
		//preenchendo as informações
		aluno.setNome(args[0]);		
		aluno.setAnoNascimento(Integer.valueOf(args[1]));		
		aluno.setMensalidade(Float.valueOf(args[2]));	
		aluno.setBolsista(Boolean.valueOf(args[3]));
		
		//chamando o método exibir
		aluno.exibir();		
	}
}
