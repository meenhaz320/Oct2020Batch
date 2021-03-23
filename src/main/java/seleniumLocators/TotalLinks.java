package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//total links in page
		//text of each link with index number and ignore blank text
		//href value of each link who's text is not empty
	
	By link = By.tagName("a");	
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	
	List<WebElement> links = driver.findElements(link);
	
	int linkCount = links.size();
	System.out.println(linkCount);
	
	int i;
	for(i=0; i<linkCount; i++) {
	String text = links.get(i).getText();
	//String href = links.get(i).getAttribute("href");
	
	if(!text.isEmpty())
	System.out.println(i+"-->"+text);
	String href = links.get(i).getAttribute("href");
	System.out.println(href);;
	//System.out.println(href);
	}
	driver.quit();
	
	
	
	
	
	
	

	}

}
