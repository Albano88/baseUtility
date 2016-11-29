package sorter.SelectionSort;

import sorter.Sorter;

public class Selection extends Sorter {

	public Selection(Comparable[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	public void sort1() {
		for (int i = 0; i < array.length; i++) {
			// min = array[i];
			// minPos = i;
			// for (int j = i + 1; j < array.length; j++) {
			// counter++;
			// if (array[j] < min) {
			// min = array[j];
			// minPos = j;
			// }
			// }
			//System.out.println("confronti sort 1 " + this.toString());
			swap(i, miniumPosition(i));
		}

	}

	private int miniumPosition(int positions) {
		int minPos = positions;
		for (int i = positions + 1; i < array.length; i++) {
			counter++;
			if (array[i].compareTo(array[minPos])<0) {
				minPos = i;
			}
		}
		return minPos;
	}

	public void sort() {
		for (int i = 0; i < array.length; i++) {
			int minPos = miniumPosition(i);
			System.out.println("confronti sort " + this.toString());
			swap(minPos, i);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A1 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Selection S = new Selection(A);
		Selection S1 = new Selection(A1);
		S.sort();
		S1.sort1();
		System.out.println("S " + S + " numero di confonti " + S.counter + " numero di scambi " + S.counterSwap);
		System.out.println("S1 " + S1 + " numero di confonti " + S1.counter + " numero di scambi " + S1.counterSwap);

	}

}
