package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ElementClickNegativecases {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		
		
		ElementUtil eUtil = new ElementUtil(driver);
		
	
		 
	  WebElement actual_error = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
	  Assert.assertEquals(actual_error.getAttribute("value"), isEmptyString());
	  System.out.println("Blank firstname assertion executed");
	 By Loginbuttononhomepage =  By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");eUtil.doClick(Loginbuttononhomepage);
	  driver.quit();
	  
	}

	private static String isEmptyString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
