package testes;

import java.util.ArrayList;
import java.util.List;

import negocio.Coordenador;
import negocio.Curso;

public class TestaCoordenador {

	public static void main(String[] args) {
		Curso c1 = new Curso();
		c1.setCodigo(123);
		c1.setDescricao("CC");
		
		Curso c2 = new Curso();
		c2.setCodigo(456);
		c2.setDescricao("ENG");
		
		List<Curso> lista = new ArrayList<Curso>();
		lista.add(c1);
		lista.add(c2);
		
		Coordenador co1 = new Coordenador();
		co1.setNome("Elberth");
		co1.setCursos(lista);
		co1.exibir();		
	}
}
