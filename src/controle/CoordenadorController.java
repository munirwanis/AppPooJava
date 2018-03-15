package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Coordenador;
import negocio.Curso;

public class CoordenadorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Curso> lista;
       
    public CoordenadorController() {
        super();
        lista = new ArrayList<Curso>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Curso c1 = new Curso();
		c1.setCodigo(Integer.valueOf(request.getParameter("codigo")));
		c1.setDescricao(request.getParameter("descricao"));
		
		lista.add(c1);
		
		Coordenador co1 = new Coordenador();
		co1.setNome(request.getParameter("nome"));
		co1.setCursos(lista);
		co1.exibir();		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}