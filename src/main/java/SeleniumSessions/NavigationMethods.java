package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        
        driver.navigate().refresh();
        
        System.out.println(driver.getTitle());
        
		

	}

}
