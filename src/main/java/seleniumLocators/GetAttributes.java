package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GetAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		By firstname = By.id("Form_submitForm_FirstName");
		//By privacy = By.xpath("//*[@id=\"Form_submitForm_LabelFieldPrivacyNote\"]/a");
		
		System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		ElementUtil e = new ElementUtil(driver);
		String att = e.getAttribute(firstname, "name");
		
		System.out.println(att);
		
		
			
		
		
		
		
		
	
		
	}

}
