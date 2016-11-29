package sorter.QuickSort;

import sorter.Sorter;

public class Quick extends Sorter {

	public Quick(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		
		this.Sort(0, array.length-1);
		
			}
	private void Sort(int from, int to){
		// TODO Auto-generated method stub
		if (from >= to)
			return;
		int p = partition(from, to);
		Sort(from, p);
		Sort(p + 1, to);
		}

	
	
	public int partition(int from, int to) {
		int pivot = array[from];
		int i = from - 1;
		int j = to + 1;
		while (i < j) {
			i++;
			while (array[i] < pivot){
				counter++;
				i++;}
			j--;
			while (array[j] > pivot){
				counter++;
				j--;}
			if (i < j) {
				swap(i, j);
			}
		}
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };

		Quick Q = new Quick(A);
		Q.sort();
		System.out.println(Q + " numero di confonti " + Q.counter + " numero di scambi " + Q.counterSwap);
	}

}
