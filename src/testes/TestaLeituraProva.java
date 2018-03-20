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
			
			FileWriter fileEscrita = new FileWriter("c:\\prova.txt");
			BufferedWriter escritorProva = new BufferedWriter(fileEscrita);
			
			String linhaProva  = null;
			String[] camposProva = null;
		
			Prova prova = null;
			String descricao = null;
			while ((linhaProva = leitorProva.readLine()) != null) {
				camposProva = linhaProva.split(";");
				
				if (camposProva.length == 1) {
					descricao = camposProva[0];
				} else {
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
					escritorProva.write(prova.obterRegistro());
				}
			}
			
			escritorProva.flush();
			escritorProva.close();
			leitorProva.close();
		} catch (IOException e) {
			e.printStackTrace();
		}				
	}
}