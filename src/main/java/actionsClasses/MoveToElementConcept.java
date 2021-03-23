package actionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");

	WebElement menuLink = driver.findElement(By.className("menulink"));
	//WebElement courses = driver.findElement(By.linkText("COURSES"));
	                       
	Actions a = new Actions(driver);
	
	a.moveToElement(menuLink).perform();
	
	WebElement courses = driver.findElement(By.linkText("COURSES"));
	
	Thread.sleep(2000);
	
	courses.click();
	
	}

}
