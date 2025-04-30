import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test
	public void checkassertequal() {
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	
	@Test
	public void check() {
		assertFalse("Hello".contains("m"));
		//assertTrue("Hello".contains("m"));
	}
	
	@Test
	public void another() {
		//String s=null;
		String s="Hello";
		assertNull(s); //Assertion is false
	}
	
	@Test
	//Gets Disabled rather than Showing error.
	public void testassump() {
		int a=5, b=25;
		Assumptions.assumeTrue(b==a*a);
		System.out.println("Hi");
	}

}
