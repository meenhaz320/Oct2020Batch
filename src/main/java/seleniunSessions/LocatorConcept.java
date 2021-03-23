package seleniunSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		/*
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		email.sendKeys("bofa");
		password.sendKeys("deeznuts");
		*/
		
		By emailId = By.id("input-email");
		By passwordId = By.id("input-password");
		
		//driver.findElement(emailId).sendKeys("aaa");
		//driver.findElement(passwordId).sendKeys("bbb");
		
		
		
		
		
		
		
	}

}
