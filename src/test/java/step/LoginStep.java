package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class LoginStep {
	WebDriver driver;
	LoginPage login;
	@Given("intilize the chorme browser")
	public void intilize_the_chorme_browser() {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\resources\\drivers\\chromedriver.exe");				
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
      
	}

	@When("we are on Testing Project Page")
	public void we_are_on_testing_project_page() {
		 driver.get("https://example.testproject.io/web/");	
	}

	@Then("enter username and Password")
	public void enter_username_and_password() throws InterruptedException {
		login = new LoginPage(driver);
			login.enterUsername();	
			login.enterPassword();
	       Thread.sleep(2000);
	}

	@Then("user click On login Button")
	public void user_click_on_login_button() {
		login = new LoginPage(driver);
		  login.clickLogin();
	}

	@Then("fill all user details in test from")
	public void fill_all_user_details_in_test_from() {
		login = new LoginPage(driver);
		login.enterUserDetails();
	}

	@Then("save the User details")
	public void save_the_user_details() {
		login = new LoginPage(driver);
		login.saveInfo();
	}

}
