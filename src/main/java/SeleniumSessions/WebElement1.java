package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	
	static WebDriver driver;
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver(); 
	
	 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
	
	
  By email = By.id("input-email");
  By password = By.id("input-password");
   
		
  ElementUtil elUtil = new ElementUtil(driver);
  
  
  elUtil.doSendKeys (email,"singhaldeveshkumar@gmaillongnamelonngname.com");
  elUtil.doSendKeys (password, "singhaldeveshkumar@gmail.com");  
  
	
	}
	
  public  static void doSendKeys(By locator, String value) {
		getElement (locator).sendKeys(value);
		 
	 }
	 
	   private void sendKeys(String value) {
	// TODO Auto-generated method stub
	
}
	public static  WebElement getElement(By locator) {
	
		return  driver.findElement(locator);
	}


 }





