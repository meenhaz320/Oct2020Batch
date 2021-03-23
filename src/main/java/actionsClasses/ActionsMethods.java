package actionsClasses;

import java.util.concurrent.TimeUnit;
import dropDown.ElementUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethods {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement username = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		//WebElement forgotpassword = driver.findElement(By.linkText("Forgotten Password"));
		
		//Actions a = new Actions(driver);
		//a.sendKeys(username, "naveen@gmail.com").perform();
		//a.sendKeys(password, "123").perform();
		//a.click(login).perform();
		//a.click(forgotpassword).perform();
		
		doActionSendkeys(username, "naveen@gmail.com");
		doActionSendkeys(password, "123");
		doActionClick(login);
		
		WebElement forgotpassword = driver.findElement(By.linkText("Forgotten Password"));
		
		doActionClick(forgotpassword);
		

	}
	
	public static void doActionSendkeys(WebElement locator, String keys) {
	Actions a = new Actions(driver);
	
	a.sendKeys(locator, "naveen@gmail.com").perform();
	}
	
	public static void doActionClick(WebElement locator) {
	Actions a = new Actions(driver);
	
	a.click(locator).perform();;
	}

}
