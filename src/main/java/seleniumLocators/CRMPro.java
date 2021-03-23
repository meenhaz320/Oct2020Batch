package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.name("username")).sendKeys("bofadeez");
		driver.findElement(By.name("password")).sendKeys("nuts");
		

	}

}
