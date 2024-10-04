package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandlingSCN2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		WebElement execProfile = driver.findElement(By.xpath("//footer//a[contains(text(), 'Executive Profile')]"));
		 WebElement pressReleases = driver.findElement(By.xpath("//footer//a [contains(text(), 'Press Releases') ]"));
		 WebElement newsArticles = driver.findElement(By.xpath("//footer//a [contains(text(), 'News Articles') ]"));
		 WebElement csSupport = driver.findElement(By.xpath("//footer//a [contains(text(), 'CS & Support') ]"));

		 Actions act = new Actions(driver);
		 
	//	 act.click(execProfile).perform();
	//	 act.click(pressReleases).perform();
		 // act.click(newsArticles).perform();
		 //  act.click(csSupport).perform();
		 
		
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.orangehrm.com/en/company/executive-profiles/");
		 Set<String> handles =    driver.getWindowHandles(); 
		  Iterator <String> it =   handles.iterator();
		  while(it.hasNext()) {
			    String child1WindowId =  it.next() ;
			    driver.switchTo().window(child1WindowId);
			    System.out.println(child1WindowId);
			    System.out.println(driver.getTitle());
			    if ( !child1WindowId.equals(parentWindowId)) {
			    	   driver.close();
			    
			   
			// **********    chilld 2**************
			    Thread.sleep(3000);
			    driver.switchTo().window(parentWindowId);
			    driver.switchTo().newWindow(WindowType.TAB);
				 driver.get("https://www.orangehrm.com/en/company/press-releases/");
				 Set<String> handles1 =    driver.getWindowHandles(); 
				  Iterator <String> it_1 =   handles1.iterator();
				  while(it_1.hasNext()) {
					    String child2WindowId =  it_1.next() ;
					    driver.switchTo().window(child2WindowId);
					    System.out.println(child2WindowId);
					    System.out.println(driver.getTitle());
					    if ( !child2WindowId.equals(parentWindowId)) {
					    	   driver.close();
					    
			    
					    	   
					    	   Thread.sleep(3000);
							    driver.switchTo().window(parentWindowId);
							    driver.switchTo().newWindow(WindowType.TAB);
								 driver.get("https://www.orangehrm.com/en/company/news-articles/");
								 Set<String> handles2 =    driver.getWindowHandles(); 
								  Iterator <String> it_2 =   handles2.iterator();
								  while(it_2.hasNext()) {
									    String child3WindowId =  it_2.next() ;
									    driver.switchTo().window(child3WindowId);
									    System.out.println(child3WindowId);
  								    System.out.println(driver.getTitle());
  								    
							    driver.switchTo().window(parentWindowId);	
							     System.out.println(driver.getTitle());
							     driver.quit();
//									    
//									    if ( !child3WindowId.equals(parentWindowId)) {
//									    	   driver.close();
									    	  
				
		
		       }
					    					    
	} 
	}
}

}  } } 