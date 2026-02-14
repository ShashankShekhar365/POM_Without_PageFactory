package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	private By usernameField = By.id("Email");
	private By passwordField = By.id("Password");
	private By loginButton = By.xpath("//button[contains(@class,'login-button')]");

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void nopCommerceLogin(String username, String password) throws InterruptedException {
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).clear();
		driver.findElement(passwordField).sendKeys(username);
		driver.findElement(loginButton).click();
		Thread.sleep(5000000);
	}

//	public void enterUsername(String username) {
//		driver.findElement(usernameField).sendKeys(username);
//	}
//
//	public void enterPassword(String password) {
//		driver.findElement(passwordField).sendKeys(username);
//	}
//	
//	public void clickLogin() {
//		driver.findElement(loginButton).click();
//	}

}
