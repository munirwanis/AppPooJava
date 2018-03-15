package testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import negocio.Aluno;
import negocio.Endereco;
import negocio.GestaoAcademica;
import negocio.Universidade;

public class TestaUniversidadeAluno {

	public static void main(String[] args) {
		int qtde = Integer.valueOf(args.length > 0 ? args[0] : "1");
		
		List<Aluno> listagemAluno = new ArrayList<Aluno>();
		
		String nome = null;
		int anoNascimento = 0;
		float mensalidade = 0;
		
		String bairro = null;
		String cidade = null;
		String uf = null;
		
		String bairroUniv = null;
		String cidadeUniv = null;
		String ufUniv = null;
		
		String razaoSocial = null;
		String email = null;
		String whatsApp = null;
		
		Aluno devedor = new Aluno("gilmar", 1955);
		
		for (int i = 0; i < qtde; i++) {
			
			nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			anoNascimento = Integer.valueOf(JOptionPane.showInputDialog("Informe o ano de nascimento do aluno: "));
			mensalidade = Float.valueOf(JOptionPane.showInputDialog("Informe a mensalidade do aluno: "));			
			
			// endereço do aluno
			bairro = JOptionPane.showInputDialog("Informe o bairro do aluno: ");
			cidade = JOptionPane.showInputDialog("Informe a cidade do aluno: ");
			uf = JOptionPane.showInputDialog("Informe a UF do aluno: ");			
			Endereco endereco = new Endereco(bairro, cidade, uf);
			
			// endereço da universidade do aluno
			bairroUniv = JOptionPane.showInputDialog("Informe o bairro da universidade: ");
			cidadeUniv = JOptionPane.showInputDialog("Informe a cidade da universidade: ");
			ufUniv = JOptionPane.showInputDialog("Informe a UF da universidade: ");			
			Endereco enderecoUniv = new Endereco(bairroUniv, cidadeUniv, ufUniv);
			
			// universidade do aluno
			razaoSocial = JOptionPane.showInputDialog("Informe a razão social da universidade: ");
			email = JOptionPane.showInputDialog("Informe o e-mail da universidade: ");
			whatsApp = JOptionPane.showInputDialog("Informe o whatsapp da universidade: ");
			Universidade universidade = new Universidade(razaoSocial, email, whatsApp);
			universidade.setEndereco(enderecoUniv);
			
			listagemAluno.add(new Aluno(nome, anoNascimento, mensalidade, endereco, universidade));
		}
		
		GestaoAcademica gestao = new GestaoAcademica();
		gestao.setAlunos(listagemAluno);
		gestao.setAlunoDevedor(devedor);
		gestao.exibir();
	}	

}
