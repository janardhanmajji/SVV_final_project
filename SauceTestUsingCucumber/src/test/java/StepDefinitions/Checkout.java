package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Checkout 
{
	private  WebDriver driver;
	
	
	@Given("user is on cart page")
	public void user_is_on_cart_page() throws InterruptedException
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
	}

	@When("user clicks on checkout_button")
	public void user_clicks_on_checkout_button() throws InterruptedException 
	{
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
	}

	@Then("user is navigated to checkout_step1")
	public void user_is_navigated_to_checkout_step1()
	{
		Assert.assertEquals("https://www.saucedemo.com/checkout-step-one.html", driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}



}
