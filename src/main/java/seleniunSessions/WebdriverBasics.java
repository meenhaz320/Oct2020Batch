package seleniunSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//open google, get title, check title, closer browser
	
	System.setProperty("webdriver.chrome.driver", "/Users/meenhaz/downloads/chromedriver 7");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");
	
	if(driver.getTitle().equals("Google")) {
		System.out.println("Correct-eh mundo") ;
	} else {
		System.out.println("Esstupido");
	}

	

	}

}
