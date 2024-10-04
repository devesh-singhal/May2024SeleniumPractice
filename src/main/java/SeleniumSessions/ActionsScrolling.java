package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

		 static WebDriver driver ;
			public static void main(String[] args) throws InterruptedException {
				
				driver = new ChromeDriver();
				driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com%2Fproducts%2Fcrm&hubs_signup-cta=nav-utility-login&hubs_content=www.hubspot.com%2Fproducts%2Fcrm&hubs_content-cta=nav-utility-login&uuid=9b6faed2-01bc-4f87-9e17-9ad3a84c02d2");
				 Thread.sleep(3000);
				
				
					Actions act = new Actions(driver);
					act.scrollToElement(driver.findElement(By.xpath("//div[@class='GoogleLoginButtonstyles__GoogleSignInDiv-sc-1n3aib7-0 dtKwrO']")))
					.click((driver.findElement(By.xpath("//div[@class='GoogleLoginButtonstyles__GoogleSignInDiv-sc-1n3aib7-0 dtKwrO']"))));
				//	act.scrollToElement(driver.findElement(By.linkText("Login")))
			 //		.click(driver.findElement(By.linkText("Login"))).perform();
					
		
		
		
		
		
		

	}

}
