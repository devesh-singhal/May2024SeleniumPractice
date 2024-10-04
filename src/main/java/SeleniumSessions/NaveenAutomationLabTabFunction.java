package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class NaveenAutomationLabTabFunction {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Thread.sleep(4000);
		
      By currency = By.xpath("//i[@class='fa fa-caret-down']");
		
		Actions act = new Actions(driver);
		Actions action = act.sendKeys(Keys.TAB);
		
		action .pause(300)
       .sendKeys(Keys.TAB)
		
		.pause	(300)
		.sendKeys(Keys.TAB)
		.pause(200)
		.sendKeys(Keys.ENTER)
		.pause(200)
		
		.build().perform();

	}

}
