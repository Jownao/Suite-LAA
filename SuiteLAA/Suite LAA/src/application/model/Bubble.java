package application.model;

public class Bubble extends Ordenacao {

	@Override
	public int[] executar(int[] numeros) {
		return this.ordenarPorBubble(numeros);
	}

	private int[] ordenarPorBubble (int[]numeros) {
		for(int i = 0;i < numeros.length-1;i++) {
			for (int j = 0; j<(numeros.length-1)-i; j++) {
				if (numeros[j] > numeros[j+1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
		return numeros;
	}
}
