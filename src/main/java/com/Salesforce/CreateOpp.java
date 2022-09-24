package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateOpp {

	public static void main(String[] args) throws InterruptedException {
		
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
		WebElement opp=driver.findElement(By.xpath("//span[text()='Opportunities']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", opp);
	    
	    driver.findElement(By.xpath("//div[@title='New']")).click();
	    driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Hema");
	    System.out.println(" st1");
	    String oppname=driver.findElement(By.xpath("//input[@name='Name']")).getText();
	    
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    driver.findElement(By.xpath("//span[text()='10']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Stage, --None--']")).click();
	    driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    
	    
	 
	    
	    
	    
			
		driver.close();
	
		
	}

}
