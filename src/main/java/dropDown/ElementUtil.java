package dropDown;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
private WebDriver driver;

public ElementUtil(WebDriver driver) {
	this.driver = driver;
}
	
public WebElement getElement(By locator) {
	return driver.findElement(locator);
}

public List <WebElement> getElements(By locator) {
	return driver.findElements(locator);
}

public String getAttribute(By locator, String attributeName) {
	return getElement(locator).getAttribute(attributeName);
}

public boolean doIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}

public boolean checkElementPresent(By locator) {
	
	if(getElements(locator).size()>0) {
		return true;
	}
	return false;
}

//use when you have alot of similar elements and want to print amount, names, and click on what you want 
public void clickElement(By locator, String value) {
	List <WebElement> eleUtil = getElements(locator);
	
	System.out.println(eleUtil.size());
	
	for(int i = 0; i<eleUtil.size(); i++) {
		String text = eleUtil.get(i).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase(value)) {
			eleUtil.get(i).click();
			break;
		}
	}
}

//***********Drop down utilities ***************


//Select class dropwdowns - - - - - 
public void selectIndex(By locator, int index) {
	Select select = new Select(getElement(locator));
	select.selectByIndex(index);
}

public void selectVisibletext(By locator, String text) {
	Select select = new Select(getElement(locator));
	select.selectByVisibleText(text);
}

public void selectValue(By locator, String text) {
	Select select = new Select(getElement(locator));
	select.selectByVisibleText(text);
}

public void dropDownOptionValues(By locator) {
//public List<String> dropDownOptionValues(By locator) {
	
	//List <String> valList = new ArrayList<String>(); //optional if you want to store as String arraylist, more options
	Select s = new Select(getElement(locator));
	List <WebElement> industryList = s.getOptions();  //get options is a list
	
	for(WebElement e : industryList) {
		String text = e.getText();
		System.out.println(text);
		//valList.add(text);       //if you don't want String arraylist, just print text
	}
	
	//return valList;
}

//Non Select class dropdowns

public void selectDropdownValue(By locator, String value) {
List<WebElement> industryList = getElements(locator);

for(WebElement e: industryList) {
	String text = e.getText();
	if(text.equalsIgnoreCase(value) ) {
	e.click();
	break;
	}
}
}

//**********    Action Class Utilities    ********************

public  void doActionSendkeys(By locator, String keys) {
Actions a = new Actions(driver);

a.sendKeys(getElement(locator), "naveen@gmail.com").perform();
}


public  void doActionClick(By locator) {
Actions a = new Actions(driver);

a.click(getElement(locator)).perform();;
}

public void moveElement(By locator) {
Actions a = new Actions(driver);
a.moveToElement(getElement(locator)).perform();;
}
}