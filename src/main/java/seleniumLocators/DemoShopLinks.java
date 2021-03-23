//make sure you have the generic function to click 
//print all text in footer, and then all ul link sin amazon
//print everything in freshworks.com
//links in bottom of amazon

package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoShopLinks {

	static WebDriver driver;

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ElementUtil e = new ElementUtil(driver);
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By demolinkpaths = By.xpath("//div[@class='list-group']/a");
		
		e.clickElement(demolinkpaths, "Downloads");
		
		//driver.quit();

		
	}

}
