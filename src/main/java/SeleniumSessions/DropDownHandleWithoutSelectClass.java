package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		// only for html tag  - select
          driver = new ChromeDriver(); 
	driver.get("https://www.orangehrm.com/en/30-day-free-trial");
	By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
	selectDropDownValue (countryOptions, "Australia") ;
		
	}

	 public static void selectDropDownValue (By locator, String value ) {
		 
		 List<WebElement>  optionsList = driver.findElements(locator);
			System.out.println(optionsList.size());
			
			for ( WebElement e : optionsList) {
				 String text = e.getText();
				 System.out.println(text);
				 if( text.contains(value)) {
					 e.click ();
					 driver.quit();
					 break;
					
					 
				 }
			}
	 }
	
	
	
	
	
	
	
	
	
	
	
	
}
