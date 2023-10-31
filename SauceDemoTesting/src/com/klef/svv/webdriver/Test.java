package com.klef.svv.webdriver;


import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		
		// Checking social media buttons.
		
		  // Click on the Twitter button
        WebElement twitterBtn = driver.findElement(By.className("social_twitter"));
        twitterBtn.click();
        Thread.sleep(1000);

        // Wait for the new tab to open
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new tab
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

        // Verify the URL
        if (driver.getCurrentUrl().equals("https://twitter.com/saucelabs")) {
            System.out.println("Twitter Button is working");
            Thread.sleep(800);
            driver.close();
        } else {
            System.out.println("Twitter button is not working");
        }

        // Switch back to the main tab
        driver.switchTo().window(windowHandles.iterator().next());

        // Click on the Facebook button
        WebElement facebookBtn = driver.findElement(By.className("social_facebook"));
        facebookBtn.click();
        Thread.sleep(1000);

        // Wait for the new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new tab
        windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

        // Verify the URL
        if (driver.getCurrentUrl().equals("https://www.facebook.com/saucelabs")) {
            System.out.println("Facebook Button is working");
            Thread.sleep(800);
            driver.close();
        } else {
            System.out.println("Facebook button is not working");
        }
        
        // Switch back to the main tab
        driver.switchTo().window(windowHandles.iterator().next());

        // Click on the LinkedIn button
        WebElement linkedinBtn = driver.findElement(By.className("social_linkedin"));
        linkedinBtn.click();
        Thread.sleep(1000);

        // Wait for the new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        

        // Switch to the new tab
        windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

        // Verify the URL
        if (driver.getCurrentUrl().equals("https://www.linkedin.com/company/sauce-labs/")) {
            System.out.println("LinkedIn Button is working");
            Thread.sleep(800);
            driver.close();
        } else {
            System.out.println("LinkedIn button is not working");
        }
        
        // Switch back to the main tab
        driver.switchTo().window(windowHandles.iterator().next());
        
        WebElement backbtn = driver.findElement(By.id("back-to-products"));
        backbtn.click();
        if(driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"))
			System.out.println("Back home button is working");
		else {
			System.out.println("Back Home button is not working");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
        
		
	}

}
