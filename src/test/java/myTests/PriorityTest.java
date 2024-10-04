package myTests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	
	@Test(priority = Integer.MIN_VALUE)
	public void searchTest() {
		System.out.println("searchTest");
	}
	
	
	@Test
	public void cartTest() {
		System.out.println("cartTest");
	}
	
	@Test
	public void paymentTest() {
		System.out.println("paymentTest");
		
	}
	
	@Test(priority = Integer.MAX_VALUE)
	public void aTest() {
		System.out.println("aTest");
		
	}
	
	@Test
	public void bTest() {
		System.out.println("bTest");
		
	}
	
	@Test
	public void cTest() {
		System.out.println("cTest");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
