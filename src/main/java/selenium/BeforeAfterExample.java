package selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterExample {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test(priority=0)
	private static void one() {
		System.out.println("first");
	}
	
	@Test(priority=1)
	private static void second() {
		System.out.println("second");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
}
