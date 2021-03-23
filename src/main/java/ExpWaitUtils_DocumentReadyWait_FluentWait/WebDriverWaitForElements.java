package ExpWaitUtils_DocumentReadyWait_FluentWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForElements {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
		By footerLinks = By.cssSelector("ul.footer-nav li a");
		
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		
		List<WebElement> footerlist = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerLinks));
		
		footerlist.stream().forEach(ele -> System.out.println(ele.getText()) ); */
		
		ElementUtil el = new ElementUtil(driver);
		
		el.getPageElementsText(footerLinks, 10);
		
		
	}

}
