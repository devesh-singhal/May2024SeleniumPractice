package SeleniumSessions;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class NegativeCasesofGmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://accounts.google.com/v3/signin/identifier?continue=https://mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.manage().window().maximize();			 
		 By createaccount = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span");
		 
		 ElementUtil eUtil = new ElementUtil(driver);
		 eUtil.doClick(createaccount);
		 
		 By personaluse = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]");
		 eUtil.doClick(personaluse);
		 
		
		 By nextbutton = By.xpath("//*[@id=\"collectNameNext\"]/div/button/span");eUtil.doClick(nextbutton);
		 WebElement actual_error = driver.findElement(By.xpath("//*[@id=\"nameError\"]/div[2]/span"));
		 Assert.assertEquals(actual_error.getAttribute("value"), isEmptyString());
		
		 System.out.println("Test Passed: Assertion executed");
		 driver.manage().window().minimize();
           
		
		 
		 
		 /////////////////
		 
		 
		 WebDriver drivera = new ChromeDriver(); 
			
		 driver.get("https://accounts.google.com/v3/signin/identifier?continue=https://mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.manage().window().maximize();			 
		 By createaccount_1 = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span");
		 
		 ElementUtil eUtil_1 = new ElementUtil(driver);
		 eUtil.doClick(createaccount_1);
		 
		 By personaluse_1 = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]");
		 eUtil.doClick(personaluse_1);
		 
		 By firstname = By.id("firstName"); eUtil.doSendKeys(firstname, "Singhal");
		 Thread.sleep(2000);
		 
		  By lastname = By.id("lastName"); eUtil.doSendKeys(lastname, "Singhal");
		 Thread.sleep(2000);
	 By nextbutton_1 = By.xpath("//*[@id=\"collectNameNext\"]/div/button/span");eUtil.doClick(nextbutton);
	 Thread.sleep(3000);
	 
	 WebElement actual_error_1 = driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/div[3]"));
	 Assert.assertEquals(actual_error_1.getAttribute("value"), isEmptyString());
	 System.out.println("Test Passed: Assertion executed");
	 By nextbutton1 = By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span");eUtil.doClick(nextbutton1);
	 driver.quit();		 
	 drivera.quit();
	}

	private static Object isEmptyString() {
		// TODO Auto-generated method stub
		return null;
	}

}
