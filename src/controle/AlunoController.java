package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Aluno;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Aluno> alunos;
       
    public AlunoController() {
        super();
        
        alunos = new ArrayList<Aluno>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Aluno aluno = new Aluno();
		
		aluno.setNome(request.getParameter("nome"));		
		aluno.setAnoNascimento(Integer.valueOf(request.getParameter("anoNascimento")));		
		aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));	
		aluno.setBolsista("S".equals(request.getParameter("bolsista")));
		
		alunos.add(aluno);
		
		if ("S".equals(request.getParameter("impressao"))) {
			PrintWriter out = response.getWriter();
			
			for(Aluno a : this.alunos){
				if(a != null){
					out.print(a.obterRelatorio() + "<br>");
				}
			}
			
		} else {
			request.getRequestDispatcher("index.html").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}