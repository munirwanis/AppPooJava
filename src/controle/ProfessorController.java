package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Disciplina;
import negocio.Professor;

public class ProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Disciplina> lista;
       
    public ProfessorController() {
        super();
        lista = new ArrayList<Disciplina>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Disciplina d1 = new Disciplina();
		d1.setCodigo(Integer.valueOf(request.getParameter("codigo")));
		d1.setDescricao(request.getParameter("descricao"));

		lista.add(d1);

		Professor p1 = new Professor();
		p1.setNome(request.getParameter("nome"));
		p1.setDisciplinas(lista);
		p1.exibir();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
