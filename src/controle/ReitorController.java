package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Instituicao;
import negocio.Reitor;

public class ReitorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Instituicao> lista;
       
    public ReitorController() {
        super();
        lista = new ArrayList<Instituicao>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Instituicao i1 = new Instituicao();
		i1.setCodigo(Integer.valueOf(request.getParameter("codigo")));
		i1.setDescricao(request.getParameter("descricao"));
		
		lista.add(i1);
		
		Reitor r1 = new Reitor();
		r1.setNome(request.getParameter("nome"));
		r1.setInstituicoes(lista);
		r1.exibir();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}
