 package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownConcepts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		Thread.sleep(2000);

		driver.findElement(By.id("justAnInputBox")).click();

		Thread.sleep(2000);

		// 1. Single Selection:
		 //selectChoiceFromDropDown(choices, "choice 7");
//		selectChoiceFromDropDown(choices, "choice 6 2 3");

		// 2. Multi Selection:
		 //selectChoiceFromDropDown(choices, "choice 2", "choice 3", "choice 6 2 3");

		// 3. All Selection:
		selectChoiceFromDropDown(choices, "choice 7");

	}

	/**
	 * This function handles three test cases : 1. single selection
	 * 2. Multi Selection
	 * 3. All Selection : Please pass "all/ALL/All"
	 * @param locator
	 * @param value
	 */
	public static void selectChoiceFromDropDown(By locator, String... value) {
		
		List<WebElement> choiceList = driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("ALL")) {
			for (WebElement e : choiceList) {
				String text = e.getText();
				System.out.println(text);

				for (int i = 0; i < value.length; i++) {
					if (text.equals(value[i])) {
						e.click();
						break;
					}
				}
			}
		}
		// all selection:
		else {
			try {
				for (WebElement e : choiceList) {
					e.click();
				}
			} catch (Exception e) {
					
			}
		}

	}

}
