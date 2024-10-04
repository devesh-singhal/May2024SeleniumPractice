package myTests;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount =  20)
	public void searchTest() {
		System.out.println("searchTest");
	}
	

}
