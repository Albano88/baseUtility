package sorter.MargeSort;

import sorter.Sorter;

public class Merge extends Sorter {

	public Merge(Comparable[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		if (array.length <= 1)
			return;

		Integer[] first = new Integer[array.length / 2];
		Integer[] second = new Integer[array.length - first.length];
		System.arraycopy(array, 0, first, 0, first.length);
		System.arraycopy(array, first.length, second, 0, second.length);
		Merge firstSorter = new Merge(first);
		Merge secondSorter = new Merge(second);
		firstSorter.sort();
		secondSorter.sort();
		merge(first, second);
	}

	private void merge(Integer[] first, Integer[] second) {
		int iFirst = 0;
		int iSecond = 0;
		int j = 0;
		counter++;
		while (iFirst < first.length && iSecond < second.length) {
			counterSwap++;
			if (first[iFirst].compareTo(second[iSecond])<0) {
				array[j] = first[iFirst];
				iFirst++;
			} else {
				array[j] = second[iSecond];
				iSecond++;
			}
			j++;
		
		System.arraycopy(first, iFirst, array, j, first.length- iFirst);
		System.arraycopy(second, iSecond, array, j, second.length - iSecond);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Merge M = new Merge(A);

		M.sort();
		System.out.println(M + " numero di confonti " + M.counter + " numero di scambi " + M.counterSwap);

	}

}
