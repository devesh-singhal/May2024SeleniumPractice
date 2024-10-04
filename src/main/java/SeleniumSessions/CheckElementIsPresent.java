package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsPresent {
	
	static WebDriver driver ;
	private static int isElementPresent;

	public static void main(String[] args) {
		 driver = new ChromeDriver(); 
		
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		   By logo = By.className("img-responsive");
		   By rightPanel = By.xpath("//div[@class='list-group']/a");
		   By forgotPasswordLink = By.linkText("Forgotten Password");
//
//		   int count = driver.findElements(logo).size();
//		   
//		   if(count ==1 ) {
//			   
//			   System.out.println("Logo Is Present");
//			   	
//		   }
//		   else {
//			   System.out.println("Logo is not present");
//		   }
		   
		  // System.out.println(isElementPresent(logo, 1));
		  // System.out.println(isElementPresent(rightPanel, 13));
		   System.out.println(isElementPresentMultipleTimes(forgotPasswordLink));
	}
	
	public static boolean isElementNotPresent (By locator ){
		 if( getElementsCount (locator) == 0) {
			 return true;
		 }
		return false;
		
		
	}
	
  public static boolean isElementPresentMultipleTimes (By locator ) {
	  if (getElementsCount (locator) >=1) {
		  return true;
		  
	  }
	   return false;
	  
	  
	  
	  
  }
	
	public static boolean isElementPresent (By locator, int expectedElementCount) {
		if (getElementsCount (locator) == expectedElementCount) {
			return true;
		}
		 return false;
		}
			

	
	public static boolean isElementPresent (By locator) {
		if (getElementsCount (locator) ==1) {
			return true;
		}
		 return false;
		}
			

	
	public static List <WebElement> getElements(By locator) {
		   
		  return  driver.findElements(locator);
	 }
	

	   public static int getElementsCount(By locator) {
			return getElements (locator).size();
			
			
		}
	   
	
	
	
	
}
