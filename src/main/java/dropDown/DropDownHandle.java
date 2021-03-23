package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	By industry = By.id("Form_submitForm_Industry");
	By country = By.id("Form_submitForm_Country");
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	ElementUtil el = new ElementUtil(driver);
	
	el.dropDownOptionValues(country);
	
	
	//Select class within main method - not good idea because you have to write Select over and over
	/*ElementUtil el = new ElementUtil(driver);
	Select industryselect = new Select(driver.findElement(industry));
	industryselect.selectByIndex(4);
	industryselect.selectByVisibleText("Manufacturing - Non Computer Related");
	industryselect.selectByValue("media");*/
	
	//Using functions in class - better to use generic functions from different class
	/*doSelectByVisibleText(country, "Albania");
	doSelectByVisibleText(industry, "Education");*/
	
	
	//Print all method if you make it within main method : better to have utility
	/*Select industrys = new Select(driver.findElement(industry));
	
	List<WebElement> industryoptions = industrys.getOptions();
	
	System.out.println(industryoptions.size());
	
	for(WebElement e : industryoptions) {
		System.out.println(e.getText());
	}*/
	
	}
	
	
	//Utilities - better to store in separate class
	/*public static WebElement getElement(By locator) {
	return driver.findElement(locator)	;
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select s = new Select(getElement(locator));
		s.selectByIndex(index);
	}
	
	public static void doSelectByVisibleText(By locator, String text) {
		Select s = new Select(getElement(locator));
		s.selectByVisibleText(text);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select s = new Select(getElement(locator));
		s.selectByValue(value); 
	}*/
}
