package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}

	@And("user enters valid password")
	public void user_enters_valid_password() {
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user redirects to home page")
	public void user_redirects_to_home_page() {
		System.out.println(driver.getCurrentUrl());
	    
	}

}
