package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreCard {

	 static WebDriver driver ;
		public static void main(String[] args) {
			
			driver = new ChromeDriver();
			driver.get("https://www.espncricinfo.com/series/icc-men-s-cricket-world-cup-league-2-2023-24-2027-1420525/canada-vs-united-states-of-america-20th-match-1445035/full-scorecard");
			 
			System.out.println(getWicketTakerName("Smit Patel"));
			
		List < String > playerScore = getScoreCard("Smit Patel") ;
		System.out.println("Score card of Smit Patel is equal to ..." +playerScore );
		 
           System.out.println("Score card of Monank Patel is equal to ..." +playerScore );
     
           System.out.println("Score card of Aaron Jones Patel is equal to ..." +playerScore );
           System.out.println("Score card of Milind Kumar is equal to ..." +playerScore );
	}

		public static List<String> getScoreCard (String playerName) {
		List <WebElement> scoreList =	driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List <String>scoreCardlList = new ArrayList<String> ();
		
		
		for (WebElement e: scoreList) {
			String text = e.getText() ;
			scoreCardlList.add(text);
			
			
		} return scoreCardlList;
				
				
 		}
		
public static String getWicketTakerName (String playerName ) {
	return 
			driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(text(),'Pargat Singh')]")).getText();			
		}
}










