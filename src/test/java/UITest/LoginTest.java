package UITest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	

	
	@Test (priority=1)
	public void pageTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");
		
	}
	
	@Test  (priority=2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("opencart/index.php?route=account/login"));
		
	}
	
	
	

	@Test  (priority=3)
	public void pageLogoTest() {
	  Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed()); 
		
	}
	
	
	
}
