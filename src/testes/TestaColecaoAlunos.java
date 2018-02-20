package testes;

import javax.swing.JOptionPane;

import negocio.Aluno;
import negocio.GestaoAcademica;

public class TestaColecaoAlunos {

	public static void main(String[] args) {
		int qtde = Integer.valueOf(args.length > 0 ? args[0] : "1");
		Aluno[] listagemAluno = new Aluno[qtde];
		Aluno devedor = new Aluno("gilmar", 1955);		
		for (int i = 0; i < listagemAluno.length; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
			int anoNascimento = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de nascimento do aluno:"));
			float mensalidade = Float.valueOf(JOptionPane.showInputDialog("Informe a mensalidade do aluno:"));
			listagemAluno[i] = new Aluno(nome, anoNascimento, mensalidade);
		}
		GestaoAcademica gestao = new GestaoAcademica();
		gestao.alunos = listagemAluno;
		gestao.alunoDevedor = devedor;
		gestao.exibir();
	}
}
