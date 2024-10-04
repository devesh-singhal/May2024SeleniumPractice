package UITest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver ;
	
	@BeforeTest
	public void setUp () {
		driver  = new ChromeDriver ();
	 
	 	driver.manage().window().maximize();
	 	driver.manage().deleteAllCookies();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	
	 	
	 	
	}
	
	

	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
		
	
	}
	

	

}
