package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class CreateAcco {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 	    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("India$321");
		driver.findElement(By.id("Login")).click();
		driver.manage().window().maximize();
		

		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		System.out.println(" st");
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		System.out.println(" st");
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("sales");
		
		
		driver.findElement(By.xpath("//p[@title='Manage your sales process with accounts, leads, opportunities, and more']")).click();
		
		WebElement accounts=driver.findElement(By.xpath("//span[text()='Accounts']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", accounts);
	    
	    driver.findElement(By.xpath("//a[@title='New']")).click();
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Hema");
	    System.out.println(" st1");
	    String accountName=driver.findElement(By.xpath("//input[@name='Name']")).getText();
	    JavascriptExecutor js4 = (JavascriptExecutor) driver;
	    
	       //specify the WebElement till which the page has to be scrolled
	       WebElement element =  driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']"));
	 
	       js4.executeScript("arguments[0].scrollIntoView();", element);
	    driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']")).click();
	    driver.findElement(By.xpath("//span[@title='Public']")).click();
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    //Assert.assertEquals(accountName, false);
	    
	    
	 
	    
	    
	    
			
		driver.close();
	
	}

}
