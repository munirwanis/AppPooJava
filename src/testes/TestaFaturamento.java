package testes;

import java.util.ArrayList;
import java.util.List;

public class TestaFaturamento {

	public static void main(String[] args) {
		List<Integer> listaMeses = new ArrayList<Integer>();
		listaMeses.add(1);
		listaMeses.add(3);
		listaMeses.add(5);
		listaMeses.add(3);
				
		List<Float> listaSalarios = new ArrayList<Float>();
		listaSalarios.add(600f);
		listaSalarios.add(500f);
		listaSalarios.add(400f);
		listaSalarios.add(600f);
		
		float[] totalAnual = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int index = 0;
		
		for (int i = 0; i < listaMeses.size(); i++) {			
			index = listaMeses.get(i)-1;
			
			totalAnual[index] = totalAnual[index] + listaSalarios.get(i); 
		}
		
		for (float f : totalAnual) {
			System.out.println(f);
		}
	}
}