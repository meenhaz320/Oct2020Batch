//If you fail the method that is depended on, the test will skip

package TestNGSession;

import org.testng.annotations.Test;

public class DependsOnMethods {

@Test (priority = 1)
public void loginTest() {
System.out.println("Login Test");
int i = 9/0;
}

@Test (priority = 2, dependsOnMethods="loginTest")
public void homeSearchTest() {
System.out.println("homeSearchTest");	
}

@Test (priority = 3, dependsOnMethods = "loginTest")
public void homeFilterTest() {
System.out.println("homeFilterTest");	
}

}
