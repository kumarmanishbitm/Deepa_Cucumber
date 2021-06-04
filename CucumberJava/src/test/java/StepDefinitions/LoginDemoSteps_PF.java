package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginPage_PF;
import pages.LoginPage;

public class LoginDemoSteps_PF {
	
	WebDriver driver = null;
	LoginPage_PF login;
	
	@Given("Open browser")
	public void open_browser() {
		System.out.println("Inside Step- browser is open");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User on Login page")
	public void user_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^Enters (.*) and (.*)$")
	public void enters_raghav_and(String username, String password) {
		login= new LoginPage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("click on LOgin button")
	public void click_on_l_ogin_button() {

		login.clickOnLoginBtn();
	}

	@Then("Navigating to Home page")
	public void navigating_to_home_page() {
		login.clickOnLogOutBtn();
		driver.quit();
	}

}
