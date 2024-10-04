package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		
		//1. recommended and valid 
		 ChromeDriver driver = new ChromeDriver();
		 // driver = new FirefoxDriver();
		
		URL remoteAddress = null;
		Capabilities capabilities = null;
		//2. 
		 WebDriver driver1 = new RemoteWebDriver(remoteAddress, capabilities);
		 
		
		
		
		
		
		
	}

}
