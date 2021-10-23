package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleAuthorPage {
	
public WebDriver driver;
	
	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By dramaPercentage = By.xpath("(//div[@class='sc_skills_total'])[1]");
	public By biographyPercentage = By.xpath("(//div[@class='sc_skills_total'])[2]");
	public By cookbooksPercentage = By.xpath("(//div[@class='sc_skills_total'])[3]");
	
	public String getPercentage(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator).getText();
	}
}
