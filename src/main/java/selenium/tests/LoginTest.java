package selenium.tests;

import org.testng.annotations.Test;

import selenium.pages.LoginPage;
import selenium.pages.NavigationMenuPage;
import selenium.utils.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest() throws InterruptedException {
		NavigationMenuPage menu = new NavigationMenuPage(driver);
		menu.navigateTo(menu.loginLink);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginInApp();
//		Thread.sleep(2000);
	}

}
