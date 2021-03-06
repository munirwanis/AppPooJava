package testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import negocio.Aluno;
import negocio.GestaoAcademica;

//http://dontpad.com/apppoojava

public class TestaColecaoAlunos {

	public static void main(String[] args) {
		int qtde = Integer.valueOf(args.length > 0 ? args[0] : "1");
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		String nome = null;
		int anoNascimento = 0;
		float mensalidade = 0;
		
		Aluno devedor = new Aluno("gilmar", 1955);
		
		for (int i = 0; i < qtde; i++) {
			
			nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			anoNascimento = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de nascimento do aluno: "));
			mensalidade = Float.valueOf(JOptionPane.showInputDialog("Informe a mensalidade do aluno: "));
			
			alunos.add(new Aluno(nome, anoNascimento, mensalidade));
		}
		
		GestaoAcademica gestao = new GestaoAcademica();
		gestao.setAlunos(alunos);
		gestao.setAlunoDevedor(devedor);
		gestao.exibir();
	}
}