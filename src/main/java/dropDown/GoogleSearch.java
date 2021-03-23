 //search dropdowns for somethign and click it 

package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	By suggestionList = By.xpath("//div[@class='sbl1']/span");
	
	driver.get("https://google.com");
	
	driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
	
	Thread.sleep(3000);
	
	//System.out.println(suggestionList.size());
	clickSuggestion(suggestionList, "Naveen Automation Labs cucumber");
	
	
	}
	
	
	public static void clickSuggestion(By locator, String textSuggestion) {
	
	List <WebElement> suggestionList = driver.findElements(locator);
	
	System.out.println(suggestionList.size());
	for(WebElement e: suggestionList) {
		String wantedText = e.getText();
		if(wantedText.equalsIgnoreCase(textSuggestion)) {
			e.click();
			break;
		}
	}
	}
	

}
