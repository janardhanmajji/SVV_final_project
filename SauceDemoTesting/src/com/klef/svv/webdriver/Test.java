package com.klef.svv.webdriver;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test 
{
	public static WebDriver driver = null;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("saucedemo.com"))
			System.out.println("Title matches");
		else
			System.out.println(title);
		
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		WebElement passwordfield  = driver.findElement(By.id("password"));
		WebElement loginbutton  = driver.findElement(By.id("login-button"));
		
		usernamefield.sendKeys("standard_user");
		passwordfield.sendKeys("secret_sauce");
		
		loginbutton.click();
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			System.out.println("Login successful");
		else {
			System.out.println("Login Failed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		// Add 1st Item to cart
		
		 WebElement button1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 button1.click();
		 Thread.sleep(1000);
		 
		// Add 2nd Item to cart
			
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
		 Thread.sleep(000);
		 
		// Locate the dropdown element by its class attribute
		 WebElement dropdownElement = driver.findElement(By.className("product_sort_container"));
		 
		 Select dropdown = new Select(dropdownElement);
		 
		 dropdown.selectByIndex(2);
		 Thread.sleep(1000);
		 
		 WebElement cartbutton = driver.findElement(By.className("shopping_cart_link"));
		 cartbutton.click();
		 
		 if(driver.getCurrentUrl().equals("https://www.saucedemo.com/cart.html"))
				System.out.println("Added to cart successfully");
			else {
				System.out.println("Failed to add to cart");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			
		 JavascriptExecutor js = (JavascriptExecutor) driver;

		 
		WebElement checkout = driver.findElement(By.id("checkout"));
		js.executeScript("arguments[0].scrollIntoView();", checkout);
		checkout.click();
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-one.html"))
			System.out.println("Checkout step one successful");
		else
			System.out.println("Unsuccessful checkout");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement firstnamefield = driver.findElement(By.id("first-name"));
		firstnamefield.sendKeys("Majji");
		Thread.sleep(250);
		
		WebElement lastnamefield = driver.findElement(By.id("last-name"));
		lastnamefield.sendKeys("Janardhan");
		Thread.sleep(250);
		
		WebElement postalcodefield = driver.findElement(By.id("postal-code"));
		postalcodefield.sendKeys("521228");
		Thread.sleep(1000);
		
		WebElement conbtn = driver.findElement(By.id("continue"));
		conbtn.click();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-step-two.html"))
			System.out.println("Checkout step two successful");
		else
			System.out.println("Unsuccessful checkout");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement finishbtn = driver.findElement(By.id("finish"));
		finishbtn.click();
		Thread.sleep(500);
		
		if(driver.getCurrentUrl().equals("https://www.saucedemo.com/checkout-complete.html"))
			System.out.println("Order Successful");
		else
			System.out.println("Unsuccessful checkout");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		
	}

}
