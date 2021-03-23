package CustomCSSSelector_WebTable_Iteration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		//Wait -- Functional Interface --> SAM (Single Abstract Method)
			//-->1. WebDriverWait (C) -- extends --> 2. FluentWait(C)
			//Explicit Wait
				//can be applied for any specific webelement (not a global wait)
				//can be applied for non web elements also -- alert, url, title
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value='Login']");
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement usernamewait = wait.until(ExpectedConditions.presenceOfElementLocated(username));
		
		usernamewait.sendKeys("naveen@gmail.com"); */
		
		//wait only applied on one glement
		waitForElementPresent(username, 10).sendKeys("abc@g.com");;
		
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(loginButton).click();				
	}
	
	public static WebElement waitForElementPresent(By locator, int timeOut) {
	
	WebDriverWait wait = new WebDriverWait(driver, timeOut);
	
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
}
		