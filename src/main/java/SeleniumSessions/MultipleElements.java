package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {

		

		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 
		List<WebElement> linkLIst =  driver.findElements(By.tagName("a"));
		int totalLinks = linkLIst.size();
		System.out.println("total links :...." +totalLinks);
		
			for(int i =0; i<totalLinks; i++ ) {
				String text = linkLIst.get(i).getText();
				if(text.length()!=0  ) {
				System.out.println(i +"="+ text);
				
				
			}

	}
	}

}
