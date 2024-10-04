package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeMinimize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://falconfs.com");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	

		// driver.get("http://falconfs.com");
		driver.manage().window().maximize();
		
		
		
		
		

	}

}
