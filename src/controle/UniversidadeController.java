package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.Aluno;
import negocio.Endereco;
import negocio.Universidade;

public class UniversidadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Aluno[] alunos;
	private int index;
       
    public UniversidadeController() {
        super();
        
        index = 0;
        
        alunos = new Aluno[10];
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		int anoNascimento = Integer.valueOf(request.getParameter("anoNascimento"));
		float mensalidade = Float.valueOf(request.getParameter("mensalidade"));
		
		String bairro = request.getParameter("bairroAluno");
		String cidade = request.getParameter("cidadeAluno");
		String uf = request.getParameter("ufAluno");
		
		Endereco endereco = new Endereco(bairro, cidade, uf);
		
		String bairroUniv = request.getParameter("bairroUniversidade");
		String cidadeUniv = request.getParameter("cidadeUniversidade");
		String ufUniv = request.getParameter("ufUniversidade");
		
		Endereco enderecoUniv = new Endereco(bairroUniv, cidadeUniv, ufUniv);
		
		String razaoSocial = request.getParameter("razaoSocial");
		String email = request.getParameter("email");
		String whatsApp = request.getParameter("whatsapp");
		
		Universidade universidade = new Universidade(razaoSocial, email, whatsApp);
		universidade.setEndereco(enderecoUniv);
		
		Aluno aluno = new Aluno(nome, anoNascimento, mensalidade, endereco, universidade);
		
		alunos[index] = aluno;
		
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
		
		index++;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}