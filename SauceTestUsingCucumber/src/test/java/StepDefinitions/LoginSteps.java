package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
	 private  WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password)
	{
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("clicks on login button")
	public void clicks_on_login_button() throws InterruptedException
	{
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(2000);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() 
	{
		Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
