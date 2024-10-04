package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllOptions {

	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		// only for html tag  - select

		
		 driver = new ChromeDriver(); 
			
		 driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		         By country = By.id("Form_getForm_Country");
		         //single country validation
		         
		         if (getDropDownOptionsTextList (country).contains("Australia")) {
		        	 System.out.println("PASS");
		        	 
		         }
		         
		 		         // multiple countries validation:
		    
		         List<String> expectedCountryList = Arrays.asList("India", "Belgium", "Austria");
		         if(getDropDownOptionsTextList (country).containsAll(expectedCountryList)) {
		        	 System.out.println("PASS");
		         }
		         else {
		        	 System.out.println("FAIL");
		         }
	}
	
	

	public static WebElement getElement (By locator ) {
		return driver.findElement(locator) ;
	}
	
	public static List<String> getDropDownOptionsTextList (By locator ) {
		Select select = new Select(getElement(locator));
       
		List<WebElement> optionsList =  select.getOptions();
        System.out.println(optionsList.size());
        List<String> optionsTextList = new ArrayList<String> ();
        
        for(WebElement e : optionsList) {
        String text =	e.getText();	
        optionsTextList.add(text);
        
    }
		return optionsTextList;
	}
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		 
}
