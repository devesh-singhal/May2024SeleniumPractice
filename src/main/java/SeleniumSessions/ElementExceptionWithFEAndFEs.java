package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionWithFEAndFEs {

	static WebDriver driver ;


	public static void main(String[] args) {
		 driver = new ChromeDriver(); 
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive34343");
		// driver.findElement(logo);
   List<WebElement>	logos =	   driver.findElements(logo);
      System.out.println(logos.size()) ;
		
		
		
		
		
		
		
		
		

	}

}
