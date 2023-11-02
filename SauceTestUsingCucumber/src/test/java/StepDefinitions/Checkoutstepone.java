package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Checkoutstepone
{
	public WebDriver driver;
	
	@Given("user is on checkoutstep1")
	public void user_is_on_checkoutstep1() throws InterruptedException 
	{
		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		 driver.findElement(By.id("login-button")).click();
		 Thread.sleep(2000);
		 
		 WebElement button1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 button1.click();
		 Thread.sleep(1000);
		 
		 WebElement button2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		 button2.click();
		 Thread.sleep(1000);
		 
		 WebElement button3 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		 button3.click();
		 Thread.sleep(1000);
		 
		 WebElement button4 = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
		 button4.click();
		 Thread.sleep(1000);
		 
		 WebElement button5 = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		 button5.click();
		 Thread.sleep(1000);
		 
		 WebElement button6 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		 button6.click();
		 Thread.sleep(1000);
		 
		 WebElement cartbutton = driver.findElement(By.className("shopping_cart_link"));
		 cartbutton.click();
		 Thread.sleep(1000);
		 
		 WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
	}

	@When("user enters firstname")
	public void user_enters_firstname() throws InterruptedException 
	{
		WebElement firstnamefield = driver.findElement(By.id("first-name"));
		firstnamefield.sendKeys("Majji");
		Thread.sleep(250);
	}

	@And("user enters secondname")
	public void user_enters_secondname() throws InterruptedException 
	{
		WebElement lastnamefield = driver.findElement(By.id("last-name"));
		lastnamefield.sendKeys("Janardhan");
		Thread.sleep(250);
	}

	@And("user enters postal code")
	public void user_enters_postal_code() throws InterruptedException 
	{
		
		WebElement postalcodefield = driver.findElement(By.id("postal-code"));
		postalcodefield.sendKeys("521228");
		Thread.sleep(1000);
	}

	@And("user clicks continue")
	public void user_clicks_continue() throws InterruptedException 
	{
		WebElement conbtn = driver.findElement(By.id("continue"));
		conbtn.click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to checkout_step2")
	public void user_is_navigated_to_checkout_step2() 
	{
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-two.html", driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}


}
