package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {
		
		 driver  = new ChromeDriver ();
		
		driver.get("https://www.falconfs.com/");
		// HTML XML PATH: address to the element in the DOM
		//1. absolute xpath:  
		//2. Relative xpath: relative attributes of the element. id, class, name, value, text
		
		//formula: 
		//htmltag[@attr='value'] 
		
		//htmltag[@attr='value' and @attr2='value']
		//htmltag[@name='email' and @id='input-email'] ---1
		//htmltag[@name='email' and @id='input-email' and @type='text']  -----2
		//htmltag[@name='email' and @id='input-email' and @type='text' and @placeholder = 'E-Mail Address'] ----3
		
		//text(); function 
		////htmltag[text()='value']
		//a[text() = 'Register'] 
	    // New customer Header = h2[text()='New Customer']
		// 316 , 296  amazon.com 5 
		
		
		//**********************
	//contains(); formaula :: 
		//htmltag[contains(@attr, 'value')]
		//input[contains(@id, 'firstname')]
		//input[contains(@id, 'firstname') and contains(@placeholder, 'First Name') ]
		//input[contains(@id, 'firstname') and @placeholder = 'First Name']
		
 //contains () with text():
		//htmltag[contains(text(), ' ' ]
		//h1[contains(text(), 'Register')] actual xpath
		//p[contains(text(), 'shop faster')]
		
		
		// ************************************************
		
		// contains with attribute and no contains with text:
		
		//htmltag[contains (@attr, 'value' ) and text() = 'value' ]
		//a[contains (@href, 'wishlist' ) and text() = 'Wish List']
		
		
		// contains with attribute and contains with text:
		//a[contains (@href, 'wishlist' ) and contains (text(), 'Wish List')]
		//div[normalize-space(//text()) = 'I have read and agree to the ']
		
		
		//=============================
		
	// 	starts-with():
			
		//input[starts-with(@placeholder, 'E')] 
		//h1[starts-with(text(), 'Register')] 
		
		
		// class:
		
		
		//valid
//	 driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email4554']")).sendKeys("xpathbydevesh@gmail.com");
		
		//valid : //input[contains (@class, ' login-email' )      ]    
		
		//driver.findElement(By.className("login-email")).sendKeys("classname@gmail.com");
		
		
		
		// capture group indexing in xpath: send keys field in Register page
	 //input [ @  class='form-control' ])[1]
			 
	WebElement ele =  driver.findElement 
			(By.xpath("(//div[@class='c-footer' ]//div[@class='ftr-menu'])/a[3]"));
	
	    
// (By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[7]"));
	
	
	 
	 ele.click();
	 Thread.sleep(4000);
	String text = ele.getText();
	System.out.println("Link Text is ....."  + text);
	driver.quit();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
 