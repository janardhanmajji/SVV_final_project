package PractisePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidCredintials
{
public static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\SVV_final_project\\SauceTestUsingCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/login");
		Thread.sleep(1000);
		WebElement usernamefield = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		usernamefield.sendKeys("2100032153");
		password.sendKeys("Jana");
		WebElement loginbutton  = driver.findElement(By.className("btn-primary"));
		loginbutton.click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
