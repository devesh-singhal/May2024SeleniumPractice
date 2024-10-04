package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver(); 
			
		 driver.get("https://google.com/");
		 
		 By SearchField = By.name("q");
		 By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");
		//  doSearch (SearchField, suggestions, "naveen automation labs" , "udemy");
		
		 ElementUtil eUtil = new ElementUtil(driver);
		 eUtil.doSearch(SearchField, suggestions, "selenium", "python");
	}

	public static void doSearch (By SearchField, By suggestions, String searchKey, String matchValue) throws InterruptedException {
	
		 driver.findElement(SearchField).sendKeys(searchKey);
		 Thread.sleep(3000);
		
		 List<WebElement> suggestionList = driver.findElements(suggestions);
		 
		 for (WebElement e : suggestionList ) {
			String text= e.getText();		 
			System.out.println(text);
			if(text.contains(matchValue)) {
				e.click() ;
				break;
			}
	}
	
			  
			 
		 }
	
	}
	
	
	

