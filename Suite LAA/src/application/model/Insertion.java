package application.model;

public class Insertion extends Ordenacao {

	@Override
	public int[] executar(int[] numeros) {
		return this.ordenarPorInsercao(numeros);
	}
	
	private int[] ordenarPorInsercao(int[]numeros) {	
		for (int i = 1; i < numeros.length; i++) {
			int j = i;
			int aux = numeros[i];
			
			while ( (j > 0) && (numeros[j-1] > aux) ) {
				numeros[j] = numeros[j-1];
				j--;
			}
			
			numeros[j] = aux;
		}
		return numeros;
	}
}
