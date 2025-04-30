package UnitTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class MyTest {
	@DisplayName("Testing") //To provide name to it
	@Test
	@Disabled
	//Denotes that the method is a test method
	void display() {
		System.out.println("My Program");
	}
	
	@RepeatedTest(2)
	@Test
	void another()
	{
		System.out.println("My Program2");
	}
	}
	
	

