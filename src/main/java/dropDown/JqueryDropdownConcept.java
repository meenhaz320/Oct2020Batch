 package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdownConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {	
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	By dropdown = By.id("justAnInputBox");
	By options = By.xpath("//span[@class='comboTreeItemTitle']");
	
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	Thread.sleep(2000);
	
	driver.findElement(dropdown).click();
	Thread.sleep(2000);
	
	selectOption(options, "choice 2");
	selectOption(options, "choice 3");

	Thread.sleep(2000);
	driver.quit();

}

public static void selectOption(By locator, String choice) {
	List <WebElement> optionz = driver.findElements(locator);
	for(WebElement e : optionz) {
		String text = e.getText();
		System.out.println(text);
	
		if(text.equalsIgnoreCase(choice)) {
		e.click();	
		break;   }
}

}
	
}
