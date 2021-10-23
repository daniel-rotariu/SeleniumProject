package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TemaCurs10 {
	
public WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");

	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {

		driver.quit();
	}
	
	@Test
	public void Login() {
		WebElement element = driver.findElement(By.linkText("Login"));
		element.click();
		driver.findElement(By.id("log")).sendKeys("TestUser");
		driver.findElement(By.id("password")).sendKeys("12345@67890");
		driver.findElement(By.className("submit_button")).click();
	}

}
