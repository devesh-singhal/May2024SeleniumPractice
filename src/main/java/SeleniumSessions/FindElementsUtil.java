package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver(); 
			
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		  By images = By.tagName("img");
		  By links = By.tagName("a");
		
		  
		  int imagesCount = getElementsCount (images);
		  System.out.println(imagesCount);
		 
	      int linksCount = getElementsCount (links);
	      System.out.println(linksCount);
	      
	     List<String> eleTextList = getElementTextList (links);
	     
	     
	     printElementTextList(links) ;
	    
	     
	}

	
	public static void printElementTextList(By locator) {
		
		List<String> eleList =   getElementTextList (locator) ;
		for (String s :eleList ) {
			System.out.println(s);
		}
	}
	
	public static List<String> getElementTextList (By locator ) {
		List <WebElement >eleList = getElements(locator);
		List <String> eleTextList = new ArrayList <String>();
		
		
		 
 		for (WebElement e : eleList ) {
			String eleText = e.getText();
			if (eleText.length()!=0) {
				eleTextList.add(eleText);	
			}
			
		}
 		   return eleTextList;
	}
	
	
	public static int getElementsCount(By locator) {
		return getElements (locator).size();
		
		
	}
	
	public static List <WebElement> getElements(By locator) {
		   
		  return  driver.findElements(locator);
	 }

	
	
	 
}


