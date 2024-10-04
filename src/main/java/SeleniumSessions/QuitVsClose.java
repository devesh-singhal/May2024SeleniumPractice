package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
  ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.falconfs.com");
	
		String title = driver.getTitle();
		System.out.println(title);
		
		// validation checkpoint
		
		if(title.equals("Falcon")) {
			System.out.println("Correct Title -Pass");
		}
		
			else {
				System.out.println("In correct Title - Fail");
			
				
			}
		
		//driver.quit();
		driver.close();
		
		System.out.println(driver.getTitle());
		}
	}






