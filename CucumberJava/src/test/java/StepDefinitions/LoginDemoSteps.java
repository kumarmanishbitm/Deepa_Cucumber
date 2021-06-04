package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
//	
//	WebDriver driver = null;
//	
//	@Given("Browser is open")
//	public void browser_is_open() {
//	    
//		System.out.println("Inside Step- browser is open");
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("User is on Login page")
//	public void user_is_on_login_page() {
//	    
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("User enters username and password")
//	public void user_enters_username_and_password() {
//	    
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Raghav");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
//	}
//	
//	@And("User click on LOgin button")
//	public void user_click_on_l_ogin_button() {
//	    
//		driver.findElement(By.xpath("//button[@id='login']")).click();
//	}
//
//	@Then("User is navigating to Home page")
//	public void user_is_navigating_to_home_page() {
//	    
//		driver.findElement(By.id("logout")).isDisplayed();
//		driver.quit();
//	}

}
