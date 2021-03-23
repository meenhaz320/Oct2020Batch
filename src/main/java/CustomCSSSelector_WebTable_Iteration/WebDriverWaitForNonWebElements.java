package CustomCSSSelector_WebTable_Iteration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements {

static WebDriver driver;

	
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://dollartree.com");
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By quickorder = By.xpath("//span[text()='Catalog Quick Order']");
		
		elementClickable(quickorder).click();
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		
		boolean quickorderurl = wait.until(ExpectedConditions.urlContains("catalog-quick-order"));	*/
		if( doesUrlContain("catalog-quick-order") ) {
			System.out.println("The order is corrrect");
		}
	}
	
	public static boolean doesUrlContain(String urlText) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		return wait.until(ExpectedConditions.urlContains(urlText));	
	}
	
	public static WebElement elementClickable(By locator) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
}
