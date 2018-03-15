package controle;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Aluno;
import negocio.Avaliacao;

public class AvaliacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Set<Avaliacao> avaliacoes;
	private Aluno aluno;
	private Avaliacao avaliacao;
       
    public AvaliacaoController() {
        super();
        aluno = new Aluno();
        
        avaliacoes = new HashSet<Avaliacao>();
        
        aluno.setAvaliacoes(avaliacoes);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		aluno.setNome(request.getParameter("aluno"));
		
		avaliacao = new Avaliacao();		
		avaliacao.setDisciplina(request.getParameter("disciplina"));
		avaliacao.setP1(Float.valueOf(request.getParameter("p1")));
		avaliacao.setP2(Float.valueOf(request.getParameter("p2")));
		avaliacao.setT1(Float.valueOf(request.getParameter("t1")));
		avaliacao.setT2(Float.valueOf(request.getParameter("t2")));
		
		avaliacoes.add(avaliacao);
		
		aluno.exibir();
		
		request.getRequestDispatcher("testaAvaliacaoAluno.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}