package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	WebDriver driver;

	By txt_username = By.id("name");

	By txt_password = By.id("password");

	By txt_login = By.id("login");
	
	By txt_country =By.id("country");
	
	By txt_address =By.id("address");
	
	By txt_email =By.id("email");
	
	By txt_phone =By.id("phone");
	
	By txt_save =By.id("save");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername() {
		driver.findElement(txt_username).sendKeys("atul");
	}

	public void enterPassword() {
		driver.findElement(txt_password).sendKeys("12345");
	}

	public void clickLogin() {
		driver.findElement(txt_login).click();
	}
	
	public void enterUserDetails() {
		driver.findElement(txt_country).sendKeys("india");
		driver.findElement(txt_address).sendKeys("india");
		driver.findElement(txt_email).sendKeys("atul@123");
		driver.findElement(txt_phone).sendKeys("112344456");
	}
	
	public void saveInfo() {
		driver.findElement(txt_save).click();
	}
	
}
