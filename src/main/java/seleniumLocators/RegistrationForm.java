//Fill each fillable line (not first) in form

package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm {
	
static WebDriver driver;

public static void main(String[] args) {
			
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://demo.opencart.com/index.php?route=account/register");
	
	List <WebElement> textFieldList = driver.findElements(By.className("form-control"));
	System.out.println(textFieldList.size());
	
	for(int i = 1; i <textFieldList.size(); i++) {
		textFieldList.get(i).sendKeys("Naveen");
	}
	//disadvantage same thing every line, so bad approach. just for understanding
	
}
}
