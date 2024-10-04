package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;
	
	public WebDriver initDriver(String BrowserName) {
		
		System.out.println("Brower name: " +BrowserName );
	
	switch(BrowserName.trim().toLowerCase()) {
	case "chrome":
	    driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/");
	    driver.quit();
	    break;
	   
   case "firefox":
	   driver=new FirefoxDriver();
	   driver.get("https://naveenautomationlabs.com/");
	    driver.get("https://www.falconfs.com");
	  String URL=  driver.getCurrentUrl();
	    System.out.println("Current urlis: " +URL );
	    driver.quit();
	   break;
		
	}
	
	return driver;
		
	}
	
	
	public void launchURL(String url) {
		
		if(url.indexOf("http")==0 || url.length() == 0) {
	 throw new BrowserException("http(s) doesnot exists in given URI"); }
		
		driver.get(url);
		
		
	
		
				
	}

}
