package binary;

import java.util.ArrayList;
import java.util.Scanner;

import linear.LinearReserch;
import reserch.Reserch;

public class BinaryReserch extends Reserch {

	public BinaryReserch(int[] array) {
		super(array);
		
		// TODO Auto-generated constructor stub
	}

	public int reserch(int value) {
		int low = 0;
		int high = array.length - 1;
		int result = -1;
		while (low <= high && result == -1) {

			int mid = (low + high) / 2;

			if (array[mid] == value) {
				result = mid;
			} else if (value < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 3, 6, 9, 12, 15, 18, 20, 22 };
		BinaryReserch B = new BinaryReserch(A);
		Scanner In = new Scanner(System.in);
		System.out.println("Insert value: ");
		int value = In.nextInt();
		System.out.println("posizione: " + B.reserch(value));
		In.close();
	}

}
