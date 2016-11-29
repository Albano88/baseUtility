package sorter.InsertionSort;

import sorter.Sorter;

public class Insertion extends Sorter {

	public Insertion(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		for (int i = 1; i < array.length; i++) {
			int min = array[i];
			int j = i;
			while (j > 0 && array[j - 1] > min) {
				array[j] = array[j - 1];
				counterSwap++;
				counter++;
				j--;
			}
			// conto il caso in cui il pecedente è già minore
			// quindi la parte che va da 0 a i è già ordinata
			counter++;
			array[j] = min;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Insertion I = new Insertion(A);

		I.sort();
		System.out.println(I + " numero di confonti " + I.counter + " numero di scambi " + I.counterSwap);

	}

}
