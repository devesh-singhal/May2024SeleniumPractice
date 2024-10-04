package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver ;

	public static void main(String[] args) {
	
		 driver = new ChromeDriver(); 
		 driver.get("https://google.com/");
		 List <WebElement> LangLinks =  driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		 System.out.println(LangLinks.size());
		 
		 for (WebElement e : LangLinks) {
			  String text = e.getText();		
			  System.out.println(text);
			  if(text.contains("मराठी")) {
				  
			  e.click();
			  break;
			  
			  
		 }
		 

	}
	}
	
}
