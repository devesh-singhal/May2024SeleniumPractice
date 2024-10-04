package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;

public class GmailNegative {


	private static File tr;
	

	public static void main(String[] args) throws IOException, InterruptedException {
	

		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://accounts.google.com/v3/signin/identifier?continue=https://mail.google.com/mail/&service=mail&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.manage().window().maximize();			 
		 By createaccount = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span");
		 
		 ElementUtil eUtil = new ElementUtil(driver);
		 eUtil.doClick(createaccount);
		 
		 By personaluse = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]");
		 eUtil.doClick(personaluse);
		 
		 By firstname = By.id("firstName"); eUtil.doSendKeys(firstname, "Singhal");
		 Thread.sleep(2000);
		 
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile (source, new File("C:/Users/Devesh/eclipse-workspace/May2024SelniumPractice/src/main/java/SeleniumSessions/Screenshots/sample.jpg"));
		  
			
				 
		 By lastname = By.id("lastName"); eUtil.doSendKeys(lastname, "Singhal");
		 Thread.sleep(2000);
	 By nextbutton = By.xpath("//*[@id=\"collectNameNext\"]/div/button/span");eUtil.doClick(nextbutton);
		 Thread.sleep(4000);
		
		// select DOB 
					Select monthdropdown = new Select(driver.findElement(By.id("month")));
				monthdropdown.selectByVisibleText("August");
				
					By day = By.xpath("//*[@id=\"day\"]"); eUtil.doSendKeys(day,"07");
					Thread.sleep(2000);
					By  year = By.xpath("//*[@id=\"year\"]");eUtil.doSendKeys(year,"1989");
			Thread.sleep(2000);
					
					// select GENDER
					Select gender = new Select(driver.findElement(By.xpath("//*[@id=\"gender\"]")));
					gender.selectByVisibleText("Male");
					Thread.sleep(2000);

					 By nextbutton1 = By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span");eUtil.doClick(nextbutton1);
					// Enter username for domain gmail.com
					 
				 Thread.sleep(3000);
				 By username = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[1]/div/div[1]/div/div[1]/input");
				 
					 eUtil.doSendKeys(username, "deveshdeveshsinghal");
					 
					 By usernamenextbutton = By.xpath("//*[@id=\"next\"]/div/button/span");eUtil.doClick(usernamenextbutton);
					 Thread.sleep(3000);
					 
 String actualError = driver.findElement (By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[1]/div/div[2]/div[2]/div")).getText();
  String expected_error = "That username is taken. Try another.";
  
  Assert.assertEquals (actualError, expected_error);
				 System.out.println("Assert condition is passed and Test Passed");
					 
	}

}
