package controle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Piloto;

public class CorridaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CorridaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			FileReader filePosicao = new FileReader("c:\\posicao.corrida.txt");
			BufferedReader leitorPosicao = new BufferedReader(filePosicao);
			
			String linhaPosicao  = null;
			String[] camposPosicao = null;
		
			Piloto piloto = null;
			PrintWriter out = response.getWriter();
			
			while ((linhaPosicao = leitorPosicao.readLine()) != null) {
				camposPosicao = linhaPosicao.split(";");
		
				piloto = new Piloto();
				piloto.setNome(camposPosicao[0]);
				
				List<Integer> posicoes = new ArrayList<Integer>();
				
				for(int i = 1; i < camposPosicao.length; i++){
					posicoes.add(Integer.valueOf(camposPosicao[i]));
				}
				
				piloto.setClassificacoes(posicoes);
				
				out.println(piloto.obterRelatorio() + "<br>");
			}
			
			leitorPosicao.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}