package PractisePrograms;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Alerts
{
	public static WebDriver driver = null;
    public static void main(String args[])throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int select;
        
        do 
        {
	        System.out.println("Select the appropriate number based on your choice");
	        System.out.println("1. Simple Alert");
	        System.out.println("2. Confirm Alert");
	        System.out.println("3. Prompt Alert");
	        System.out.println("Please select one number from the above to view to alert message from the browser");
	
	        select = scanner.nextInt();
	
	        switch (select)
	        {
	            case 1:
	                simplealert();
	                break;
	
	            case 2:
	                confirmalert();
	                break;
	            case 3:
	                promptalert();
	                break;
	            default:
	                System.out.println("This is not a case that you must select");
	                break;
	
	        }
        }while(select!=4);
        scanner.close();


    }


    private static  void simplealert()
    {
    	
    	System.setProperty("webdriver.chrome.driver", "G:\\SVV_final_project\\SauceTestUsingCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.id("alertBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("output")).getText());
    }

    private static  void confirmalert() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver", "G:\\SVV_final_project\\SauceTestUsingCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();



        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());

    }


    private static  void promptalert() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver", "G:\\SVV_final_project\\SauceTestUsingCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Sabitha");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("promptBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(2000);
    }

}