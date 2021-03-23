package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		By URL = By.id("Form_submitForm_subdomain");
		By firstName = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submit = By.id("Form_submitForm_action_request");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		ElementUtil e = new ElementUtil(driver);
		
		//System.out.println(driver.findElement(URL).isDisplayed());
		System.out.println(e.doIsDisplayed(URL));
		
	


	}

}
