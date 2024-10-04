package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
	   driver.get("https://flipkart.com/");
//		 List <WebElement> imagesList = driver.findElements(By.tagName("img"));
//		 int imagesCount = imagesList.size();
//		 System.out.println("Total count of images ..." + imagesCount );
//		 
//		 for(WebElement e :imagesList ) {
//			String srcValue =  e.getAttribute("src");
//					System.out.println(srcValue);
//					
					
					
//		 }
//		 
		List <WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("Tottal Links are : " +totalLinks.size());
		for( WebElement e : totalLinks) {
			String text =   e.getText();
			 String hrefValue =  e.getAttribute("href");
			 System.out.println(text + " : " + hrefValue   );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
