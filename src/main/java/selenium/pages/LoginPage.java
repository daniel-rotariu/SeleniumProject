package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.xpath("//input[@class='submit_button']");
	
	//metode
	public void loginInApp() {
		driver.findElement(usernameField).sendKeys("TestUser");
		driver.findElement(passwordField).sendKeys("12345@67890");
		driver.findElement(submitButton).click();
	}

}
