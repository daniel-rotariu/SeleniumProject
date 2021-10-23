package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationMenuPage {
	
	public WebDriver driver;
	
	public NavigationMenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By shopLink = By.linkText("BOOKS");
	public By contactLink = By.linkText("CONTACTS");
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	
	public By loginLink = By.linkText("Login");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
