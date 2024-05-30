package JavaPrograms;

import java.util.Comparator;
import java.util.TreeSet;

public class Compare {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new Compariable());
		t.add(12);
		t.add(1);
		t.add(4);
		t.add(7);
		t.add(99);
		t.add(2);
		t.add(22);
		System.out.println(t);
		

	}

}

class Compariable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 =  (Integer) o1;
		Integer i2 =  (Integer) o2;
		//return -i1.compareTo(i2);
		return i1.compareTo(i2);
	}

	
	
}
