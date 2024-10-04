package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	 static WebDriver driver ;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		 
		// CHILE TO PARENT
		//backward traversing : child to parent :  //input[@id='username' ]/../../../../..
		// formula1 for immediate aprent: //input[@id='username' ]/..
	// 	formula2 (ONLY FOR IMMEDAITE OR DIRECT PARENT)	= //input[@id='username' ]/parent::div 
		
	// formula3 (FOR GRAND PARENT) = //input[@id='username' ]/ancestor::form
    // formula4 (FOR PRECEDING and FOLOOWING SIBLINGS) ://a[text()='Joe.Root' ]/parent::td/preceding-sibling::td/input
		
		
		
   //   driver.findElement(By.xpath("//a[text()='Jasmine.Morgan' ]/ancestor::tr//input")).click();
   //   driver.findElement(By.xpath("//a[text()='Garry.White' ]/ancestor::tr//input")).click();
   //   driver.findElement(By.xpath("//a[text()='Joe.Root' ]/ancestor::tr//input")).click();	
		
		selectUser("Kevin.Mathews");
		selectUser("Jasmine.Morgan");
		selectUser("Joe.Root");
		selectUser("Garry.White");
		selectUser("John.Smith");
		selectUser("Jordan.Mathews");
		selectUser("Username");
		
	String userRole = 	driver.findElement(By.xpath("//a[text()='Joe.Root' ]/parent::td/following-sibling::td")).getText();
		System.out.println(userRole);
		String employeeName= driver.findElement(By.xpath("//a[text()='Joe.Root' ]/parent::td/following-sibling::td/following-sibling::td")).getText();
		System.out.println(employeeName);
	String status =	driver.findElement(By.xpath("//a[text()='Joe.Root' ]/parent::td/following-sibling::td/following-sibling::td/following-sibling::td"))
			.getText();
	System.out.println(status);
	
	
		
		
	}
          public static void selectUser ( String userName) {
        	  driver.findElement(By.xpath("//a[text()='"+userName+"' ]/ancestor::tr//input")).click();
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
        	  
          }
}
