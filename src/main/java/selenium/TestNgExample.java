package selenium;

import org.testng.annotations.Test;

public class TestNgExample {

	@Test(priority=0)
	private static void one() {
		System.out.println("first");
	}
	
	@Test(priority=1)
	private static void second() {
		System.out.println("second");
	}
	
	@Test(priority=2)
	private static void third() {
		System.out.println("third");
	}
	
	@Test
	private static void fourth() {
		System.out.println("fourth");
	}
	
	@Test
	private static void fifth() {
		System.out.println("fifth");
	}
}
