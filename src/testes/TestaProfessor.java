package testes;

import java.util.ArrayList;
import java.util.List;

import negocio.Disciplina;
import negocio.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		Disciplina d1 = new Disciplina();
		d1.setCodigo(123);
		d1.setDescricao("POO");

		Disciplina d2 = new Disciplina();
		d2.setCodigo(456);
		d2.setDescricao("UML");

		List<Disciplina> lista = new ArrayList<Disciplina>();
		lista.add(d1);
		lista.add(d2);

		Professor p1 = new Professor();
		p1.setNome("Elberth");
		p1.setDisciplinas(lista);
		p1.exibir();
	}
}
