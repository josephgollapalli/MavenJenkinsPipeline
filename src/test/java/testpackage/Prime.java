package testpackage;

import java.util.ArrayList;

public class Prime {
	//Added comment in the remote 
	//Added comment in the local branch master to LFBranch
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
