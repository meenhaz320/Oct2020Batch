//get title bar

package Java8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//By title = By.xpath("/html/body/h2");
		
		//driver.switchTo().frame("main");
		
		driver.switchTo().frame(2);
		String title = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(title);
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}
