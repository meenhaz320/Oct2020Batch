package seleniunSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
	
	WebDriver driver = null;
	
public WebDriver init_driver(String browserName) {
	
	if (browserName.equals("chrome")) {

		System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
		driver = new ChromeDriver();	
	}

	else if (browserName.equals("chrome")) {

		System.setProperty("webdriver.gecko.driver", "/Users/meenhaz/downloads/geckodriver");
		driver = new FirefoxDriver();	
	}

	else if (browserName.equals("safari")) {
		driver = new SafariDriver();
	}

	else {
		System.out.println("Please pass the correct browser");
	}	
	
	return driver;
}

	public void launchURL(String URL) {
		driver.get(URL);
	}
	
	public String getTitle( ) {
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void closeDriver() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	

}
