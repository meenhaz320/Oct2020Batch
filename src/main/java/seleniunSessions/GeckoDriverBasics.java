package seleniunSessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//open google, get title, check title, closer browser
	
	System.setProperty("webdriver.gecko.driver", "/Users/meenhaz/downloads/geckodriver");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://google.com");
	
	if(driver.getTitle().equals("Google")) {
		System.out.println("Correct-eh mundo") ;
	} else {
		System.out.println("Esstupido");
	}

	

	}

}
