package CustomCSSSelector_WebTable_Iteration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableIteration {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> tablelist = driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		System.out.println(tablelist.size());
		
		for(WebElement e: tablelist) {
			System.out.println(e.getText());
		}
		// tableList.stream().forEach(ele -> System.out.println(ele.getText()));
		System.out.println("---------");

		// table[@id='customers']/tbody/tr/td[1] --6
		// table[@id='customers']/tbody/tr/td[2]
		// table[@id='customers']/tbody/tr/td[3]

		for (int i = 1; i <= 3; i++) {
			System.out.println("Column ----" + i + "-----");

			List<WebElement> columnData = driver
					.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[" + i + "]"));

			columnData.stream().forEach(ele -> System.out.println(ele.getText()));

	}

}
