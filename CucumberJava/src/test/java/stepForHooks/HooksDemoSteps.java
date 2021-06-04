package stepForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoSteps {
	WebDriver driver = null;

//	@Before
//	public void browserSetup() {
//		System.out.println("I am Inside browserSetup");
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@After
//	public void tearDown(){
//		System.out.println(" I am Inside tearDown");
//		driver.quit();
//	}
//	
//	@BeforeStep
//	public void beforeSteps(){
//		System.out.println("I am inside beforeSteps");
//	}
//	@AfterStep
//	public void afterSteps(){
//		System.out.println("I am inside afterSteps");
//	}
//	
//	@Given("user is on Login page")
//	public void user_is_on_login_page() {
//
//	}
//
//	@When("enter valid credentials")
//	public void enter_valid_credentials() {
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//	}
//
//	@Then("user is navigating to home page")
//	public void user_is_navigating_to_home_page() {
//	}

}
