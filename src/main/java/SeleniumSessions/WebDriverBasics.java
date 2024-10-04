package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.falconfs.com");
	
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
