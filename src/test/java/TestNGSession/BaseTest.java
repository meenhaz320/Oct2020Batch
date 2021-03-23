package TestNGSession;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browsername) {
		
		switch(browsername) {
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		
		case "firefox":	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		
		default: 
		System.out.println("Please pass correct browser");
		break;
		
		}
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
	}
	
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}	
	
}
