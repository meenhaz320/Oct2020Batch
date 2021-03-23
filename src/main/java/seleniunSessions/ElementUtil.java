package seleniunSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public void clickElement(By Locator) {
		getElement(Locator).click();
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
