package CustomCSSSelector_WebTable_Iteration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements2 {

	static WebDriver driver;

	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By signon = By.xpath("//input[@type='submit']");
		
		elementClickable(signon).click();
		System.out.println(waitForAlert().getText());
		
		
		
		
}
	
	public static boolean doesUrlContain(String urlText) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		return wait.until(ExpectedConditions.urlContains(urlText));	
	}
	
	public static WebElement elementClickable(By locator) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static Alert waitForAlert() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.alertIsPresent());
	}
}
