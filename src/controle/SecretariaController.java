package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Documento;
import negocio.Secretaria;

public class SecretariaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Documento> lista;
       
    public SecretariaController() {
        super();
        lista = new ArrayList<Documento>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Documento d1 = new Documento();
		d1.setCodigo(Integer.valueOf(request.getParameter("codigo")));
		d1.setDescricao(request.getParameter("descricao"));
		
		lista.add(d1);
		
		Secretaria s1 = new Secretaria();
		s1.setNome(request.getParameter("nome"));
		s1.setDocumentos(lista);
		s1.exibir();		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}