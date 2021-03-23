package ExpWaitUtils_DocumentReadyWait_FluentWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {

static WebDriver driver;

	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		ElementUtil el = new ElementUtil(driver);
		
		By linktext = By.linkText("Forgot Password?");
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(linktext));
		
		element.click();*/
		
		el.clickWhenReady(linktext, 5);
		
		
		
		
		
	}

}
