package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser1 {

	public static void main(String[] args) {
		
		
		String browser = "firefox";
		WebDriver driver = null;
		
	   switch(browser.trim().toLowerCase()) {
	   case "chrome":
		    driver = new ChromeDriver();
		   break;
		   
	   case "firefox":
		   driver=new FirefoxDriver();
		   break;
		   
		   default:
			System.out.println("plz pass the right browser...");
			throw new BrowserException("--------INVALID BROWSER-------");
			
				
				
	   }
	   
	   
			driver.get("https://naveenautomationlabs.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.quit();
			
   
	   
	   }
		
			

}
