package myTests;

import org.testng.annotations.Test;

public class DependsOnMethod {


	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i = 5/0 ;
			
		
	}
	
	

	@Test (dependsOnMethods = "loginTest")
	public void HomepageTest() {
		System.out.println("HomePage Test");
		
		
	}
	

         @Test (dependsOnMethods = "HomepageTest")
	public void searchTest() {
		System.out.println("Seacrh Test");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	 
}
