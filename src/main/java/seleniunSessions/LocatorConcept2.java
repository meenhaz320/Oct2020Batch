package seleniunSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
		 driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	By URL = By.id("Form_submitForm_subdomain");
	By firstName = By.id("Form_submitForm_FirstName");
	By lastname = By.id("Form_submitForm_LastName");
	By submit = By.id("Form_submitForm_action_request");
	
	/*
	getElement(URL).sendKeys("TestAutomation");
	getElement(firstName).sendKeys("John");
	getElement(lastname).sendKeys("Wick");
	*/
	
	/*doSendKeys(URL, "TestAutomation");
	doSendKeys(firstName, "John");
	doSendKeys(lastname, "Wick");
	clickElement(submit);*/
	
	}
	
	/*
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static void clickElement(By Locator) {
		getElement(Locator).click();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		*/
	}


