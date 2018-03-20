package testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import negocio.Piloto;

public class TestaLeitura {

	public static void main(String[] args) {
		try {
			FileReader filePosicao = new FileReader("c:\\posicao.corrida.txt");
			BufferedReader leitorPosicao = new BufferedReader(filePosicao);
			
			String linhaPosicao  = null;
			String[] camposPosicao = null;
		
			Piloto piloto = null;
			while ((linhaPosicao = leitorPosicao.readLine()) != null) {
				camposPosicao = linhaPosicao.split(";");
		
				piloto = new Piloto();
				piloto.setNome(camposPosicao[0]);
				
				List<Integer> posicoes = new ArrayList<Integer>();
				
				for(int i = 1; i < camposPosicao.length; i++){
					posicoes.add(Integer.valueOf(camposPosicao[i]));
				}
				
				piloto.setClassificacoes(posicoes);
				
				piloto.exibirCampos();
			}
			
			leitorPosicao.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
