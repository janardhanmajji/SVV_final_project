package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OpenBrowser 
{
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() 
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("Url is entered")
	public void url_is_entered() throws InterruptedException
	{
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(3000);
	}

	@And("clicks enter")
	public void clicks_enter() 
	{
	   
	}

	@Then("user is navigated to Sauce Demo website")
	public void user_is_navigated_to_sauce_demo_website() 
	{
		driver.getPageSource().contains("Swag Labs");
		driver.close();
		driver.quit();
	}


}
