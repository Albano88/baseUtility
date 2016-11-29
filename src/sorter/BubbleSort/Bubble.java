package sorter.BubbleSort;

import sorter.Sorter;

public class Bubble extends Sorter {

	public Bubble(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	public void sort() {
		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < this.array.length; j++) {
				counter++;
				if (array[j] > array[i]) {
					//System.out.println(this.toString()); per visionare gli scambi;
					swap(i, j);
				}
			}
		}
	}

	public void sort2() {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int j = 0; j < this.array.length - 1; j++) {
				counter++;
				if (array[j] > array[j + 1]) {
					swap(j, j + 1);
					swap = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		int[] A2 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Bubble B = new Bubble(A);
		Bubble C = new Bubble(A2);

		B.sort();
		System.out.println(B);
		System.out.println("B ha effettuato " + B.counter + " confronti" + ", Scambi " + B.counterSwap);

		 C.sort2();
		 System.out.println(C);
		 System.out.println("C ha effettuato " + C.counter + " confronti" + ", Scambi " + C.counterSwap);

	}
}
