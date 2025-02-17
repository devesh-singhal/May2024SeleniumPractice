package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropDownHandling {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		// only for html tag  - select
		
	// 	use - Select Class in selenium - select tag is mandatory
		
		// Select as parent and Option as child 
		
		 driver = new ChromeDriver(); 
			
		 driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		         By country = By.id("Form_getForm_Country");
       //  WebElement countryEle = driver.findElement(country);
		//         Select select = new Select (countryEle);

		       //   select.selectByVisibleText("Brazil");
		       //      select.selectByIndex(5);
		      //   select.selectByValue("Belgium");
		        
	        
		     //    selectDropdownValueByVisibleText(country, "India") ;
          //Thread.sleep(2000);
		   //      selectDropdownValueBuyIndex (country, 6);
		     //    selectDropdownValueByValue ( country,"Belgium" );
		         
		    
		           //     List <WebElement> listOfOptions =  select.getOptions();
		            //    System.out.println(listOfOptions.size());
		         
		         int count = getDropDownOptionsCount (country);
		         System.out.println(count-1);
		                
		        		 
	}

   public static int getDropDownOptionsCount (By locator ) {
	   Select select = new Select (getElement(locator)) ;
	     return  select.getOptions().size();
	   
   }
	
	
	
public static void selectDropdownValueByVisibleText (By locator, String visibleText ) {
		Select select = new Select (getElement  (locator ));
		select.selectByVisibleText(visibleText);
				
	}
	
	
	public static void selectDropdownValueBuyIndex (By locator, int index ) {
		Select select = new Select (getElement  (locator ));
		select.selectByIndex(index);
				
	}
	
	
	
	public static void selectDropdownValueByValue (By locator, String value ) {
		Select select = new Select (getElement  (locator ));
		select.selectByValue(value);
				
	}
	
	
	
	public static WebElement getElement (By locator ) {
		return driver.findElement(locator) ;
	}
}



















