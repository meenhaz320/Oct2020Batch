package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest2 {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		
		WebElement hotelLink = driver.findElement(By.linkText("Hotels"));
		hotelLink.click();
		
		//if it says Element is not able to interact error
		
		js.clickElementByJS(hotelLink);
		
	}
}
		