package testes;

import java.util.ArrayList;
import java.util.List;

import negocio.Documento;
import negocio.Secretaria;

public class TestaSecretaria {

	public static void main(String[] args) {
		Documento d1 = new Documento();
		d1.setCodigo(123);
		d1.setDescricao("RG");
		
		Documento d2 = new Documento();
		d2.setCodigo(456);
		d2.setDescricao("CPF");
		
		List<Documento> lista = new ArrayList<Documento>();
		lista.add(d1);
		lista.add(d2);
		
		Secretaria s1 = new Secretaria();
		s1.setNome("Elberth");
		s1.setDocumentos(lista);
		s1.exibir();		
	}
}
