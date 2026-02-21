package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	// With Page Factory

	@FindBy(id = "Email")
	WebElement usernameField;

	@FindBy(id = "Password")
	WebElement passwordField;

	@FindBy(xpath = "//button[contains(@class,'login-button')]")
	WebElement loginButton;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public void nopCommerceLogin(String username, String password) throws InterruptedException {
		usernameField.clear();
		usernameField.sendKeys(username);
		passwordField.clear();
		passwordField.sendKeys(password);
		loginButton.click();
		Thread.sleep(5000);
	}

	// Without Page Factory

//	private WebDriver driver;
//
//	private By usernameField = By.id("Email");
//	private By passwordField = By.id("Password");
//	private By loginButton = By.xpath("//button[contains(@class,'login-button')]");
//
//	public LoginPage(WebDriver ldriver) {
//		this.driver = ldriver;
//	}
//
//	public void nopCommerceLogin(String username, String password) throws InterruptedException {
//		driver.findElement(usernameField).clear();
//		driver.findElement(usernameField).sendKeys(username);
//		driver.findElement(passwordField).clear();
//		driver.findElement(passwordField).sendKeys(username);
//		driver.findElement(loginButton).click();
//		Thread.sleep(5000);
//	}
//
////	public void enterUsername(String username) {
////		driver.findElement(usernameField).sendKeys(username);
////	}
////
////	public void enterPassword(String password) {
////		driver.findElement(passwordField).sendKeys(username);
////	}
////	
////	public void clickLogin() {
////		driver.findElement(loginButton).click();
////	}

}
