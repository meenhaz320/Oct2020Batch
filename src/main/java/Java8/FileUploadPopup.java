//pick a file from your computer to upload

package Java8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {
	
	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type="file" should be there when you scan upload button
	
		//on the upload button, instead of clicking it, send your file name
	//	driver.findElement(By.name("upfile")).sendKeys("/Users/naveenautomationlabs/Downloads/unnamed.gif");
				
		//driver.findElement(By.xpath("//input[@type='submit']")).click();

}
}
