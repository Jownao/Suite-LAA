package application.model;

public class Merge extends Ordenacao{
	@Override
	public int[] executar(int[] numeros) {
		return this.ordenarPorMerge(numeros,numeros.length);
		//return null;
	}
	
    public int[] ordenarPorMerge(int[] a, int n) {
        if (n < 2)
            return a;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        ordenarPorMerge(l, mid);
        ordenarPorMerge(r, n - mid);

        merge(a, l, r, mid, n - mid);
		return a;
        
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
        
    }
}
