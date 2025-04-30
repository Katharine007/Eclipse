import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestingDemo {
	@DisplayName("NewName")
	@Test
	void display() {
		System.out.println("Hello");
	}
	@RepeatedTest(3)
	@DisplayName("Extra")
	@Test
	void show() {
		System.out.println("Hello");
	}

}
