package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {
	
static WebDriver driver;

	public static void main(String[] args) {
		//total images in page
		//url of each image
		//href value of each link who's text is not empty
	
	By image = By.tagName("img");	
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	
	List<WebElement> images = driver.findElements(image);
	
	int imageCount = images.size();
	System.out.println(imageCount);

	for(WebElement e: images)	{					

	String src = e.getAttribute("src");
	System.out.println(src);;
	
	}
	
	driver.quit();
	}
	

}

