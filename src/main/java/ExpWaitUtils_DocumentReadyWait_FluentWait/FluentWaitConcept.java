package ExpWaitUtils_DocumentReadyWait_FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Utilities.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");

		By forgotPwd = By.linkText("Forgot Password?");
		
		ElementUtil el = new ElementUtil(driver);
		
		
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(2))
								.ignoring(NoSuchElementException.class)
								.ignoring(StaleElementReferenceException.class);
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
		
		ele.click();	*/
		
		/*
		waitForElementToBeFluent(10, 2, forgotPwd).click();
		*/
		
		
		
	}
	
	/*public static WebElement waitForElementToBeFluent(int timeOut, int polling, By locator) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(polling))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class);

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

			
	} */

}
