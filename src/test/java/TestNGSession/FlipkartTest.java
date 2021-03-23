package TestNGSession;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseTest {

	@Test(priority = 1)
	public void flipkartTitleTest() {
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println("page title is :" + title);
		AssertJUnit.assertTrue(title.contains("Online Shopping"));
	}

	@Test(priority = 2)
	public void flipkartLogoTest() {
		AssertJUnit.assertTrue(driver.findElement(By.className("_2xm1JU")).isDisplayed());
	}

}