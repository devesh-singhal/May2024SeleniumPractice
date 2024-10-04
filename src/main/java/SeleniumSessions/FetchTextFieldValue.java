package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		 driver = new ChromeDriver(); 
		
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		 driver.findElement(By.id("input-email")).sendKeys("qa@gmail.com");
//		 driver.findElement(By.id("input-password")).sendKeys("qa@gmail.com");
//		 
//		 String text = driver.findElement(By.id("input-email")).getAttribute("value");
//		 System.out.println(text);
		
		 ElementUtil eUtil = new ElementUtil(driver);
		 
		 
		 By emailID = (By.id("input-email"));
		 By password = (By.id("input-password"));
		 
		 eUtil. doSendKeys (emailID, "testingdevesh@gmail.com");
		String v1 =  doElementGetAttribute (emailID, "value");
		System.out.println(v1);
		 
		 
	}

	
	
	private static void doSendKeys(By emailID, String string) {
		// TODO Auto-generated method stub
		
	}



	public  void doSendKeys(By locator, CharSequence[] value) {
		 ((org.openqa.selenium.WebElement) getElement (locator)).sendKeys(value);
		 
	 }
	
	
	
	public static String doElementGetAttribute (By locator, String attrName) {
		
		return getElement(locator).getAttribute(attrName);
				
	
	}

	private static WebElement getElement(By locator) {
		
		return  driver.findElement(locator);
	}
	
	

	
}
