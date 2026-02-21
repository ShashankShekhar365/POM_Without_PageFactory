package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void testValidLogin() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.nopCommerceLogin("admin@yourstore.com", "admin");

//		loginPage.enterUsername("admin@yourstore.com");
//		loginPage.enterPassword("admin");
//		loginPage.clickLogin();

		System.out.println("Title of the page is:" + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
	}

}
