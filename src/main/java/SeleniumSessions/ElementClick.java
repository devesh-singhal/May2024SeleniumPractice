package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ElementClick {
	
	public static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
		By.tagName("h1");
		
		ElementUtil eUtil = new ElementUtil(driver);
		
		
		 
		 By firstname = By.id("input-firstname");
			By lastname = By.id("input-lastname");
				 By email = By.id("input-email");
		 By phone = By.id("input-telephone");
				 By password = By.id("input-password");
				 By confirmpassword = By.id("input-confirm");
				 By agreecheckbox = By.name("agree");
			 By continueclick = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
			 By continueclicksuccesspage = By.linkText("Continue");
				 
			
				eUtil. doSendKeys(firstname, "singhalfalcondeveshsinghal");
				eUtil. doSendKeys(lastname, "singhalfalcondeveshsinghal");
				eUtil.doSendKeys(email, "0053@gmail.com");
				eUtil.doSendKeys(phone, "9718051896");
				eUtil.doSendKeys(password, "Test456");
				eUtil. doSendKeys(confirmpassword, "Test456");
				
    eUtil.doClick(agreecheckbox);
	
    eUtil.doClick(continueclick);
    
    driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/success");
    
    eUtil.doClick(continueclicksuccesspage);
    
    By editinformation = By.linkText("Edit your account information");
    
    Thread.sleep(4000);
    
    eUtil.doClick(editinformation);
    
  
   Thread.sleep(3000);
   
   // fname update
   WebElement element = driver.findElement(By.id("input-firstname"));
   
   element.clear() ;
   
   By firstnamemodify = By.id("input-firstname");
   
   eUtil.doSendKeys(firstnamemodify, "FNAME UPDATED");
   
   Thread.sleep(3000);
   
   // LNAME UPDATE:
   
   WebElement element1= driver.findElement(By.id("input-lastname"));
   
   element1.clear();
   By lnamemodify = By.id("input-lastname");
   eUtil.doSendKeys(lnamemodify, "LANME UPDATED" );
   By lastpagecontinue = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
   eUtil.doClick(lastpagecontinue);
   
   
   Thread.sleep(3000);
   // EMAIL UPDATE:
   
   WebElement element2 = driver.findElement(By.id("input-email"));
   element2.clear();
   By emailmodify = By.id("input-email");
   eUtil.doSendKeys(emailmodify, "singhalfalcon@gmail.com");
   eUtil.doClick(emailmodify);   
   
   
   
   
   
   
    
    
    
    
    
    
    
    
    
    
   
    
    
    
				 
				 
				 

		 

				 
	 }

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

	private static Actions sendKeys(Keys backSpace) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void keyUp(Keys control) {
		// TODO Auto-generated method stub
		
	}

	private static void findElement(By id) {
		// TODO Auto-generated method stub
		
	}

	private static void sendKeys(By editinformation, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void keyDown(Keys control) {
		// TODO Auto-generated method stub
		
	}

	private static void doSendKeys(By firstname, String string) {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
