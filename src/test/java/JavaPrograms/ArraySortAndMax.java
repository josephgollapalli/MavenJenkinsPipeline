package JavaPrograms;

import java.util.Iterator;

public class ArraySortAndMax {
	//Test message
	public static void main(String[] args) {
		int[] a = {19,59,3,4,10,33,9};
<<<<<<< HEAD
		//For loop added at same line Testing from local
=======
		//For loop added at same line Testing it
>>>>>>> 09047b0fdf6ab4cd6e59589bd82603581d7c5e21
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				int temp =0;
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int max = a[0];
		for (int k = 0; k < a.length; k++) {
			if (a[k]>max) {
				max = a[k];
			}
		}
		System.out.println(max);
	}

}
