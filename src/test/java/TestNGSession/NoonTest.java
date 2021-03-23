package TestNGSession;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoonTest extends BaseTest {

		@Test(priority = 1)
		public void noonTitleTest() {
			driver.get("https://www.noon.com/uae-en/");
			String title = driver.getTitle();
			System.out.println("page title is :" + title);
			AssertJUnit.assertTrue(title.contains("Online Shopping"));
		}

		@Test(priority = 2)
		public void noonLogoTest() {
			AssertJUnit.assertTrue(driver.findElement(By.xpath("//a[@href='/uae-en']/img")).isDisplayed());
		}

		@Test(priority = 3)
		public void noonSignInTest() {
			AssertJUnit.assertTrue(driver.findElement(By.id("dd_header_signInOrUp")).isDisplayed());

		}

	}
