package testes;

import java.util.ArrayList;
import java.util.List;

import negocio.Instituicao;
import negocio.Reitor;

public class TestaReitor {

	public static void main(String[] args) {
		Instituicao i1 = new Instituicao();
		i1.setCodigo(123);
		i1.setDescricao("Anhanguera");
		
		Instituicao i2 = new Instituicao();
		i2.setCodigo(456);
		i2.setDescricao("Infnet");
		
		List<Instituicao> lista = new ArrayList<Instituicao>();
		lista.add(i1);
		lista.add(i2);
		
		Reitor r1 = new Reitor();
		r1.setNome("Elberth");
		r1.setInstituicoes(lista);
		r1.exibir();
		
	}
}
