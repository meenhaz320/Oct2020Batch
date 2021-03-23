//How do we use no select classes even when there is a select tagname

package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutUsingSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
	By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	ElementUtil e = new ElementUtil(driver);
	
	driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	
	//e.nonDropdownList(industry);
	e.selectDropdownValue(country, "Bangladesh");
	
	/*
	List<WebElement> industryList = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
	//find the common xpath of all the options avaialible and put it in a WebElement list. Print the text in a loop
	
	for(WebElement e: industryList) {
		System.out.println(e.getText());
	}
	*/

	}

}
