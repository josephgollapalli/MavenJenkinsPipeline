package testpackage;

import org.testng.annotations.Test;

public class TestPr {

	@Test()
	public void atest1() {	
		System.out.println("Atest1");
	}
	
	@Test()
	public void cctest1() {
		System.out.println("Btest1");
	}
	
	@Test(priority = 1)
	public void ctest1() {	
		System.out.println("Ctest1");
	}

	@Test(priority = 4)
	public void dtest1() {
		System.out.println("Dtest1");
	}
}
