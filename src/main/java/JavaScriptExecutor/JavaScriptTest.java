package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
	
		
		JavaScriptUtil js = new JavaScriptUtil(driver);
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		WebElement username = driver.findElement(By.name("username"));
 		WebElement password = driver.findElement(By.name("password"));
		
		String title = js.getTitleByJS();
		String innertext = js.getPageInnerText();
		
		/*if(innertext.contains("Deals & Sales Pipeline")) {
			System.out.println("Pass");
		} else {System.out.println("fail"); }
		
		js.drawBorder(login); */
		
		//js.generateAlert("Behh");
		
		/*js.flash(username);
		username.sendKeys("batch automation");
		
		js.flash(password);
		password.sendKeys("test1234");
		
		js.flash(login);
		login.click();*/
		
		
		
		
		
		
		

}
}
