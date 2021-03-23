package seleniunSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
	 driver = new ChromeDriver();
		
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
	//locators
	By URL = By.id("Form_submitForm_subdomain");
	By firstName = By.id("Form_submitForm_FirstName");
	By lastname = By.id("Form_submitForm_LastName");
	By submit = By.id("Form_submitForm_action_request");
	
	ElementUtil e = new ElementUtil(driver);
	
	e.doSendKeys(URL, "automation learning");
	e.doSendKeys(firstName, "John");
	e.doSendKeys(lastname, "Wick");
	e.clickElement(submit);
	

	}

}
