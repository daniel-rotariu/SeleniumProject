package selenium.tests;

import org.testng.annotations.Test;

import selenium.pages.NavigationMenuPage;
import selenium.utils.BaseTest;

public class NavigationTest extends BaseTest{
	
	@Test
	public void navigateToContacts() {
		NavigationMenuPage menu = new NavigationMenuPage(driver);
		menu.navigateTo(menu.contactLink);
	}

}
