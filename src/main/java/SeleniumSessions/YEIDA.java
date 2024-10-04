package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class YEIDA {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver(); 
		
		 driver.get("https://schemes.yamunaexpresswayauthority.com/");
		 
		 driver.manage().window().maximize();
		 
		ElementUtil eUtil = new ElementUtil(driver);
		
		By MobileNumber = By.id("LoginID");
		By password = By.id("Password");
		By loginbutton = By.xpath("/html/body/div[1]/div/div[2]/div/form/div[1]/div[6]/button");
      By applyonline = By.xpath("/html/body/div[2]/div/div[2]/div/div/div[5]/div[2]/div[3]/div/div/a/div[1]");
		By rhscorner = By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/img");
	  
	
		
		eUtil.doSendKeys(MobileNumber, "9718051896");
		eUtil.doSendKeys(password, "Dugga@135#");	
	
		
		
	
		Thread.sleep(10000);
        eUtil.doClick(loginbutton);
        Thread.sleep(5000);
        eUtil.doClick(applyonline);
        
        Thread.sleep(4000);
      driver.navigate().back();
        Thread.sleep(4000);
        
      
        eUtil.doClick(rhscorner);
       
       driver.navigate().to("https://schemes.yamunaexpresswayauthority.com/Schemes/SignUp");
       
//       By register = By.xpath("/html/body/div[1]/div/div[2]/div/form/div[1]/div[6]/a");
         
       
	
       By applicantname = By.xpath("//*[@id=\"ApplicantName\"]");
		 eUtil.doSendKeys(applicantname, "Roopam Singhal");
		 
	By mobilenumberregister = By.xpath("//*[@id=\"R_MobileNo\"]");
	eUtil.doSendKeys(mobilenumberregister, "9358404012");
	
	By emailregister = By.id("R_Email");
	 eUtil.doSendKeys(emailregister, "singhal12345@gmail.com");
	 
	 Thread.sleep(5000);
      
	 By registeraftercaptcha = By.xpath("/html/body/div[1]/div/div[2]/div/form/div[1]/div[4]/button");
	 eUtil.doClick(registeraftercaptcha);
	 
	 
       
       
  
       
		
	 

       
       
       
       
       
       
       
       
       
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
