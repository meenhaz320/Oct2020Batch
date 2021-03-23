//Invocation Count will repeat , maybe you want to login again and again
//generally not used

package TestNGSession;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 10)
	public void loginTest() {
	System.out.println("Login Test");
	
	}
	
}
