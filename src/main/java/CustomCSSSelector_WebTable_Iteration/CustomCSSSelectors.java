package CustomCSSSelector_WebTable_Iteration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCSSSelectors {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//page doesnt really work

		//css selector: its a locator not an attribute
				//id - #id or tag#id
				//class -- .classname or tag.classname
				//.c1.c2.c3...cn
				// .form-control.private-form__control.login-email
				
				// #username
				// input#username
				// input.form-control.private-form__control.login-email
				// input.login-email
				// #username.login-email
				// #username.form-control.private-form__control.login-email
				// .login-email#username
				// input.login-email#username
				
				
				By e1 = By.cssSelector(".form-control.private-form__control.login-email");
				By e2 = By.xpath("//input[@class='form-control private-form__control login-email']");
				By e3 = By.className("form-control private-form__control login-email"); //this one is wrong
				

				// tag[attr = 'value']
				// input[name='username'] --css
				//input[@name = 'username'] --xpath
				
				// tag[attr1 = 'value'][attr2 = 'value']
				// input[name='username'][type='text'][placeholder='Username'] --css
				//input[@name='username' and @type='text' and @placeholder='Username'] --xpath

				//parent to child:
				// div.private-form__input-wrapper input#username
				// div.private-form__input-wrapper > input#username
				// ul.footer-nav li a
				// ul.navbar-right a
				By footerLinks = By.cssSelector("ul.footer-nav li a");
				
				//child to parent: cant do that.
				
				// input[id*='user'] --contains
				// input[id*='-origin-airport'] -- contains
				// input[id^='user'] -- starts with
				// input[id$='name'] -- ends with
				
				//comma in css selector:
				// input#username, input#password, button#loginBtn, span.private-checkbox__indicator
				
				By loginFormLocators = By.cssSelector
						("input#username, input#password, "
								+ "button#loginBtn, span.private-checkbox__indicator");
				
				int loginFormElementsCount = driver.findElements(loginFormLocators).size();
				
				if(loginFormElementsCount == 4) {
					System.out.println("My login page is displayed with all mandatory fields....");
				}
				
				//following-sibling in css:
				// input[name='username'] + input
				
				//not operator in css:
				
				//form-control private-form__control login-email
				//form-control private-form__control login-password m-bottom-3
				
				// input.form-control.private-form__control:not(#username)
				
				//index in css: nth-of-type()
				// ul.list-unstyled li:nth-of-type(9) a -- specific index
				// ul.list-unstyled li:nth-of-type(n) a -- all the elements
				
				
			}

		}