package PractisePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticLocatorsandHTML 
{
	public static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\SVV_final_project\\SauceTestUsingCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(1000);
		
		System.out.println(driver.getTitle());
		
		// By name
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		
		firstname.sendKeys("MAJJI");
		lastname.sendKeys("JANARDHAN");
		
		// By ID and checkbox and radio buttons
		
		WebElement malecheckbox = driver.findElement(By.id("sex-0"));
		malecheckbox.click();
		
		WebElement yoe = driver.findElement(By.id("exp-4"));
		yoe.click();
		
		// X-Path
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		date.sendKeys("11/12/2003");
		
		// CheckBox
		
		WebElement mt = driver.findElement(By.id("profession-0"));
		mt.click();
		
		WebElement at = driver.findElement(By.id("profession-1"));
		at.click();
		
		Thread.sleep(500);
		
		WebElement uft = driver.findElement(By.id("tool-0"));
		uft.click();
		
		 // Select Continent
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        
        // Select Command
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

    	Thread.sleep(2000);
    	
        // Click Submit
        driver.findElement(By.id("submit")).click();
		
		
		
	
		
		driver.quit();
	}
}
