package selenium.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.pages.NavigationMenuPage;
import selenium.pages.SingleAuthorPage;
import selenium.utils.BaseTest;

public class SingleAuthorPercentages extends BaseTest {
	
	@Test
	public void checkPercentages() {
		NavigationMenuPage menu = new NavigationMenuPage(driver);
		menu.navigateTo(menu.singleAuthorLink);
		SingleAuthorPage singleAuthorPage = new SingleAuthorPage(driver);
		assertEquals(singleAuthorPage.getPercentage(singleAuthorPage.dramaPercentage),"95%");
		assertEquals(singleAuthorPage.getPercentage(singleAuthorPage.biographyPercentage),"75%");
		assertEquals(singleAuthorPage.getPercentage(singleAuthorPage.cookbooksPercentage),"82%");
	}

}
