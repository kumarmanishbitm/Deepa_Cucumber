package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = null;

	@Given("browser is open.")
	public void browser_is_open() {
		System.out.println("Inside Step- browser is open");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User is on Google Search page.")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step-User is on Google Search page");

		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step - user enters a text in search box");

		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

	}

	@And("Hit enter button")
	public void hit_enter_button() {
		System.out.println("Inside Step - Hit enter button");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}

	@Then("User is navigated to search results.")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - User is navigated to search results");

		driver.getPageSource().contains("Online Courses");
		driver.quit();
	}

}