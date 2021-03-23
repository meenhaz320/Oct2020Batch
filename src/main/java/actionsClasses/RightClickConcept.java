package actionsClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	
public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	WebElement rightclick = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
	
	
	Actions a = new Actions(driver);
	a.moveToElement(rightclick).contextClick().build().perform();
	
	List<WebElement> commands = driver.findElements(By.xpath("/html/body/ul/li/span"));
	
	for(WebElement e: commands) {
		String text = e.getText();
		if (text.equalsIgnoreCase("Copy")) {
			e.click();
			break;
		}
	}
	
	
}

}
