package ExpWaitUtils_DocumentReadyWait_FluentWait;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentReadyState {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		jsWaitForPageLoad(10);
		
		
	}
	
		public static void jsWaitForPageLoad(int timeOut) {
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String jsCommand = "return document.readyState";
			
			String result = js.executeScript(jsCommand).toString();
			
		/*	if(result.equalsIgnoreCase("complete")) {	
				System.out.println("The page is fully loaded");
				return;
			}*/
			
			for(int i = 0; i<timeOut; i++) {
			
				try {
				Thread.sleep(1000);	
				if(result.equalsIgnoreCase("complete")) {	
					System.out.println("The page is fully loaded");
					return;
				}
				}
				catch (InterruptedException e) {
				e.printStackTrace();
				}
					
			}
		
	}

	

}
