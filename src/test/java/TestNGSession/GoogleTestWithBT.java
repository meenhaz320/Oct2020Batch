package TestNGSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTestWithBT extends BaseTest{

	@Test(priority = 1)
	public void googleTitleTest() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page title is :" + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority = 2)
	public void googleLogoTest() {
		Assert.assertTrue(driver.findElement(By.id("hplogo")).isDisplayed());
	}

	//How to exclude test 1. Enabled = false, 2. TestNG Exclude method
	//@Test(priority = 3, enabled = false) This means it will be ignored. Don't comment out, looks unprofessional
	@Test(priority = 3)
	public void googleSearchButtonTest() {
		Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
	}

}