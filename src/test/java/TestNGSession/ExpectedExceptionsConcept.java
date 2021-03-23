//The whole point of a expected Exceptions is to not throw error. However, it still won't run code after error
//Generally not used in framework

package TestNGSession;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {
	
String name = "Tom";
	
//@Test (expectedExceptions = ArithmeticException.class) 
@Test (expectedExceptions = {ArithmeticException.class, NullPointerException.class}) 
public void divTest(){
System.out.println("div test");
//int i = 9/0;

ExpectedExceptionsConcept obj = new ExpectedExceptionsConcept();

//if you leave just ArithmeticException and 1. No exception occures, 2. a different error occurs:
//you'll get an error
obj=null;
System.out.println(obj.name);

//9/0: runs test but still won't do this code after exceptoin
System.out.println("Finish div test");

}

}
