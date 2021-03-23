package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
		By forgotpassword = By.linkText("Forgot your password?");
		
		/*List <WebElement> eleList = driver.findElements(forgotpassword);
		
		eleList.size();
		
		if(eleList.size()>0) {
			System.out.println("The Element is here");
		} else {	
			System.out.println("The Element is not here");
		}*/

}
public static boolean checkElementPresent(By locator) {
	List <WebElement> eleList = driver.findElements(locator);
	
	if(eleList.size()>0) {
		return true;
	}
	return false;
}

}