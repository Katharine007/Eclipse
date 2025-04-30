package UnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test
	public void checkasserequal() {
		int res=1;
		int exp=1;
		assertEquals(res,exp);
	}
    @Test
	public void check() {
		assertFalse("Hello".contains("m"));
		//assertTrue("Hello".contains("m"));
	}
    
    @Test
    public void another() {
    	String s="hello";
    	assertNull(s);
    }
    
    @Test
    public void testassumption() {
    	int a=5, s=25;
    	Assumptions.assumeTrue(s==a*a);
    	System.out.println("Hi");
    }
}
