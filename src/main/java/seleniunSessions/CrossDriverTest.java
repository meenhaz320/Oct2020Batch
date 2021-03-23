package seleniunSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossDriverTest {
	
static WebDriver driver;
	
public static void main(String[] args) {
	
String browser = "safari";

if (browser.equals("chrome")) {

	System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
	driver = new ChromeDriver();	
}

else if (browser.equals("chrome")) {

	System.setProperty("webdriver.gecko.driver", "/Users/meenhaz/downloads/geckodriver");
	driver = new FirefoxDriver();	
}

else if (browser.equals("safari")) {
	driver = new SafariDriver();
}

else {
	System.out.println("Please pass the correct browser");
}

driver.get("https://google.com");
String title = driver.getTitle();
System.out.println(title);
	
}



}
