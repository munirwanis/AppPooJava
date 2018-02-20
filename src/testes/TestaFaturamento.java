package testes;

public class TestaFaturamento {

	public static void main(String[] args) {
		int[] meses = {1, 3, 5, 3};
		float[] salarios = {600, 500, 400, 600};
		float[] totalAnual = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		int index = 0;
		
		for (int i = 0; i < meses.length; i++) {			
			index = meses[i]-1;
			
			totalAnual[index] = totalAnual[index] + salarios[i]; 
		}
		
		for (float f : totalAnual) {
			System.out.println(f);
		}
	}
}