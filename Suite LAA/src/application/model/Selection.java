package application.model;

public class Selection extends Ordenacao {

	@Override
	public int[] executar(int[] numeros) {
		return this.ordenarPorSelection(numeros);
}
	private int[] ordenarPorSelection(int[] vetor) {
		for (int i=0;i<vetor.length-1;i++) {
			int indexMenor = i;
			
			for (int j = i+1 ;j<vetor.length;j++) {
				if (vetor[indexMenor]>vetor[j]) {
					indexMenor = j;
				}
			}
			int aux = vetor[indexMenor];
			vetor[indexMenor] = vetor[i];
			vetor[i] = aux;
			
		}
		return vetor;
	}
}