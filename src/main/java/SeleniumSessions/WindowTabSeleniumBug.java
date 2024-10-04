package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabSeleniumBug {

	public static void main(String[] args) {
	

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		
		
		
		
	driver.switchTo().newWindow(WindowType.WINDOW);
	 	driver.get("https://google.com");  
	 	String googleWindowId = driver.getWindowHandle() ;

	 	driver.switchTo().window(googleWindowId ) ;
	 	System.out.println(googleWindowId);
	 	
	 	driver.close();
	 	
	 	driver.switchTo().newWindow(WindowType.WINDOW) ;
		
		driver .get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(driver.getWindowHandle() );	
		driver.close() ;
		
		
		
		
		
		// driver.switchTo().newWindow(WindowType.TAB);
		
	//	System.out.println(driver.getTitle());
		
		
	
		 	
		
		
		
		
		
		
		
		
		

	}

}
