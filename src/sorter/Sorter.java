package sorter;

import sorter.BubbleSort.Bubble;
import sorter.InsertionSort.Insertion;
import sorter.MergeSort.Merge;
import sorter.QuickSort.Quick;
import sorter.SelectionSort.Selection;
import sorter.ShellSort.Shell;

public abstract class Sorter {

	public Comparable[] array;
	public int counter;
	public int counterSwap;

	public Sorter(Comparable[] array) {
		super();
		this.array = array;
		this.counter = 0;
		this.counterSwap = 0;
	}

	public abstract void sort();
	

	public String toString() {
		String string = "";
		for (int i = 0; i < array.length; i++) {
			string += array[i];
		}
		return string;
	}

	protected void swap(int i, int j) {
		counterSwap++;
		Comparable temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {

		Integer[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A2 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A3 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A4 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A5 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A6 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Integer[] A7 = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Bubble B = new Bubble(A);
		Bubble B2 = new Bubble(A2);
		Selection S = new Selection(A3);
		Insertion I = new Insertion(A4);
		Shell SH = new Shell(A5);
		Quick Q = new Quick(A6);
		Merge M= new Merge(A7);
		B.sort();
		System.out.println(B);
		System.out.println("B ha effettuato " + B.counter + " confronti, scambi " + B.counterSwap);
		System.out.println("");
		
		B2.sort2();
		System.out.println(B2);
		System.out.println("B2 ha effettuato " + B2.counter + " confronti, scambi " + B2.counterSwap);
		System.out.println("");

		S.sort1();
		System.out.println(S);
		System.out.println("S ha effettuato " + S.counter + " confronti, scambi " + S.counterSwap);
		System.out.println("");

		I.sort();
		System.out.println(I);
		System.out.println("I ha effettuato " + I.counter + " confronti, scambi " + I.counterSwap);
		System.out.println("");
		
		SH.sort();
		System.out.println(SH);
		System.out.println("SH ha effettuato " + SH.counter + " confronti, scambi " + SH.counterSwap);
		System.out.println("");
		
		Q.sort();
		System.out.println(Q);
		System.out.println("Q ha effettuato " + Q.counter + " confronti, scambi " + Q.counterSwap);
		System.out.println("");
		
		M.sort();
		System.out.println(M);
		System.out.println("M ha effettuato " + M.counter + " confronti, scambi " + M.counterSwap);
		System.out.println("");
		
		
	}
}
