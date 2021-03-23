package CustomXPath;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxis {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/new-zealand-v-pakistan-2020-21-1233950/new-zealand-vs-pakistan-2nd-t20i-1233960/full-scorecard");
		//driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		
		/*WebElement batter = driver.findElement(By.xpath("//a[contains(text(),'Haider Ali')]/parent :: td/following-sibling::td/span"));
		System.out.println(batter.getText());*/
		
		getBatterName("Haider Ali");
		
		
		//This part was copied below
		/*List <WebElement> scorelist = driver.findElements(By.xpath("//a[contains(text(),'Haider Ali')]/parent :: td/following-sibling::td"));
		
		for(int i = 0; i<scorelist.size(); i++ ) {
			String score = scorelist.get(i).getText();
			System.out.print(score+" ");
		}*/
		
		getPlayerScoreCard("Haider Ali").stream().forEach(ele -> System.out.print(ele+" "));
		getPlayerScoreCard("Abdullah Shafique").stream().forEach(ele -> System.out.print(ele+" "));
		
		
		
	}
	
	public static void getBatterName(String playerName) {
		WebElement batter = driver.findElement
			(By.xpath("//a[contains(text(),'"+playerName+"')]/parent :: td/following-sibling::td/span"));
		System.out.println(batter.getText());
	}
	
	public static List<String> getPlayerScoreCard(String playername) {
System.out.println();
System.out.println(playername + "->");
		
		
List <String> scoreCardList = new ArrayList<String>();
List <WebElement> scorelist = 
driver.findElements(By.xpath
		("//a[contains(text(),'"+playername+ "')]/parent :: td/following-sibling::td"));
		
		for(int i = 0; i<scorelist.size(); i++ ) {
			String score = scorelist.get(i).getText();
			//System.out.print(score+" ");
			scoreCardList.add(score);
			
			
		}
		
		return scoreCardList;
		
	}

}
