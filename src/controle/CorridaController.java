package controle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Piloto;

/**
 * Servlet implementation class CorridaController
 */
public class CorridaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorridaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			FileReader filePosicao = new FileReader("C:\\posicao.corrida.txt");
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
				
				System.out.println(piloto.obterRelatorio() + "<br/>");
			}
			
			leitorPosicao.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
