package testpackage;

import java.util.ArrayList;

//Without pull the code from remote we cannot push new changes to remote.
public class Prime {
	//Removed all comments for here
	public static void main(String[] args) {
		int num = 10;
		ArrayList al = new ArrayList();
		for (int i = 2; i < num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					isPrime = false;
				}
			}
			
		}
	}

}
