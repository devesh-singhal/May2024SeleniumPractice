package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFields {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
			List<WebElement>  textFieldList =	driver.findElements(By.className("form-control"));
			textFieldList.size();	
	       System.out.println("Totallist of field ... " +textFieldList.size());		
	       
	       for (WebElement e : textFieldList ) {
	    	   
	    	 String text = e.getAttribute("placeholder");
	    	 System.out.println(text);
	       }
	       
	}

	private static void getAttribute(String string) {
		// TODO Auto-generated method stub
		
	}

}
