package testes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TestaListas {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
//		List<Integer> idades = new ArrayList<Integer>();//wrapper
		
		String[] lista = new String[10];
//		int[] listaIdades = new int[10];
		
		int qtde = Integer.valueOf(args[0]);
		
		for (int i = 0; i < qtde; i++) {
			lista[i] = JOptionPane.showInputDialog("Informe o nome: ");
			nomes.add(JOptionPane.showInputDialog("Informe o nome: "));
		}
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("Tamanho de 'nomes': " + nomes.size());
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println("Tamanho de 'args': " + args.length);
	}
}
