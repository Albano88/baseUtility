package linear;

import java.util.Scanner;

import reserch.Reserch;

public class LinearReserch extends Reserch {
	
	public LinearReserch(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
		
	}

	
	private boolean found = false;


	public int reserch(int value) {
		int result = -1;
		for (int i = 0; i < array.length && !found; i++) {
			if (array[i] == value) {
				found = true;
				result = i;
			}
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 5, 8, 1, 7, 3, 5, 9, 7, 11 };
		LinearReserch L = new LinearReserch(A);
		Scanner In = new Scanner(System.in);
		System.out.println("Insert value: ");
		int value = In.nextInt();
		System.out.println("posizione: " + L.reserch(value));
		In.close();
	}

}
