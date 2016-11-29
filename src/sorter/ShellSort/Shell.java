package sorter.ShellSort;

import sorter.Sorter;

public class Shell extends Sorter {

	public Shell(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		int n = array.length - 1;
		int inc = n;
		int indexCurrent = 0;
		int indexPrevius = 0;
		int indexK;
		boolean inserted = false;
		while (inc > 1) {
			inc = inc / 2;
			for (int j = 0; j < inc; j++) {
				// k è il 2 elemento di ogni catena
				indexK = j + inc;
				while (indexK <= n) {
					inserted=false;
					int elemX = array[indexK];
					indexCurrent = indexK;
					indexPrevius = indexCurrent - inc;				
					
					while (indexPrevius >= j && !inserted) {
						counter++;
						if (elemX < array[indexPrevius]) {
							array[indexCurrent] = array[indexPrevius];
							indexCurrent = indexPrevius;
							indexPrevius = indexPrevius - inc;
							counterSwap++;
						} else{
							inserted = true;
						}
						
					}
					
					array[indexCurrent] = elemX;
					indexK = indexK + inc;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 5 };
		Shell S = new Shell(A);

		S.sort();
		System.out.println(S + " numero di confonti " + S.counter + " numero di scambi " + S.counterSwap);
	}

}
