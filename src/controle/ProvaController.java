package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Disciplina;
import negocio.Prova;

/**
 * Servlet implementation class ProvaController
 */
public class ProvaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private List<Prova> provas;
	
    /**
     * @throws IOException 
     * @throws NumberFormatException 
     * @see HttpServlet#HttpServlet()
     */
    public ProvaController() throws NumberFormatException, IOException {
        super();
        this.provas = new ArrayList<Prova>();
        
		try {
			FileReader fileLeitura;
			fileLeitura = new FileReader("c:\\alunos.prova.txt");
			BufferedReader leitorProva = new BufferedReader(fileLeitura);
			
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
					
					this.provas.add(prova);
				}
			}
			leitorProva.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String disciplina = request.getParameter("disciplina");
		String nome = request.getParameter("nome");
		
		List<Float> notas = new ArrayList<Float>();
		
		float trabalho = Float.parseFloat(request.getParameter("trabalho"));
		for (int i = 1; i < 8; i ++) {
			notas.add(Float.valueOf(request.getParameter("questao" + i)));
		}
		
		Prova prova = new Prova();
		prova.setDisciplina(new Disciplina(disciplina));
		prova.setNome(nome);
		prova.setNotaTrabalho(trabalho);
		prova.setNotasProva(notas);
		
		FileWriter writer = new FileWriter("c:\\_"+prova.getNome()+".txt");
		writer.write(prova.obterRelatorioIndividual());
		writer.flush();
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
