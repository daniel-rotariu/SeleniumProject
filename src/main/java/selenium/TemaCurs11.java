package selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TemaCurs11 {
	
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
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void Tema11() {
		//selectam o carte
		driver.findElement(By.linkText("It’s a really strange story")).click();
		//deschidem sectiunea Reviews
		WebElement reviews = driver.findElement(By.id("tab-title-reviews"));
		reviews.click();
		//apasam butonul Submit
		WebElement submit = driver.findElement(By.className("submit"));
		submit.click();
		//apasam accept cand apare alerta
		Alert alertaJs  = driver.switchTo().alert();
		alertaJs.accept();
		//adaugam un rating
		driver.findElement(By.className("star-4")).click();
		//adaugam textul in sectiunea Your review
		driver.findElement(By.id("comment")).sendKeys("This is my comment");
		//adaugam numele
		driver.findElement(By.id("author")).sendKeys("Daniel");
		//adaugam adresa email
		driver.findElement(By.id("email")).sendKeys("daniel@test.com");
		//bifam Save my email...
		driver.findElement(By.id("wp-comment-cookies-consent")).click();
		submit.click();
		assertEquals(driver.findElement(By.className("woocommerce-review__awaiting-approval")).getText(),"Your review is awaiting approval");
		
	}

}
