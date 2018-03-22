package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import negocio.Disciplina;
import negocio.Prova;

public class TestaLeituraProva {

	public static void main(String[] args) {
		try {
			FileReader fileLeitura = new FileReader("c:\\alunos.prova.txt");
			BufferedReader leitorProva = new BufferedReader(fileLeitura);
			
			FileWriter fileAprovacao = new FileWriter("c:\\alunos.aprovados.txt");
			BufferedWriter escritorAprovacao = new BufferedWriter(fileAprovacao);
			
			FileWriter fileReprovacao = new FileWriter("c:\\alunos.reprovados.txt");
			BufferedWriter escritorReprovacao = new BufferedWriter(fileReprovacao);
			
			String linhaProva  = null;
			String[] camposProva = null;
		
			Prova prova = null;
			String descricao = null;
			while ((linhaProva = leitorProva.readLine()) != null) {
				camposProva = linhaProva.split(";");
				
				if (camposProva.length == 1) {
					descricao = camposProva[0];
				} else {
					FileWriter writer = new FileWriter("c:\\aluno_"+camposProva[8]+".txt");
					prova = new Prova();
					prova.setDisciplina(new Disciplina(descricao));
					prova.setNotaTrabalho(Float.valueOf(camposProva[0]));
					prova.setNome(camposProva[8]);
					
					List<Float> notas = new ArrayList<Float>();				
					for(int i = 1; i < camposProva.length-1; i++){
						notas.add(Float.valueOf(camposProva[i]));
					}				
					prova.setNotasProva(notas);
					
					prova.exibir();
					
					if (prova.verificaAprovacao()) {
						escritorAprovacao.write(prova.obterRegistro());						
					} else {
						escritorReprovacao.write(prova.obterRegistro());
					}
					writer.write(prova.obterRelatorioIndividual());
					writer.flush();
					writer.close();
				}
			}
			
			escritorAprovacao.flush();
			escritorAprovacao.close();
			escritorReprovacao.flush();
			escritorReprovacao.close();
			leitorProva.close();
		} catch (IOException e) {
			e.printStackTrace();
		}				
	}
}