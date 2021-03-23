//print al links in a specific section, 
//find a specific text in that seciton

package seleniumLocators;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class GoogleLanguageLinks {
		
	static WebDriver driver;

	public static void main(String[] args) {
				
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		//languages not available in USA 
		
		//List = xpath/a
		//for(int i = 0; i<size; i++) {links.get(i).getText();
		//if(text.equals(..) { lang.get(i).click
		//break
		
		//make into a method with locator and string parameters, so as to not hardcode the specific language
		
		
		
		
}
}