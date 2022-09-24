package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteOpp {

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
	    
	    driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Hema"+Keys.ENTER);  
	    
	    JavascriptExecutor je = (JavascriptExecutor)driver;
	     WebElement edit =driver.findElement(By.xpath("//tbody/tr[1]/td[8]//a[@title='Show 3 more actions']"));
	   
	    je.executeScript("arguments[0].scrollIntoView();", edit);	   
	   edit.click();
	    driver.findElement(By.xpath("//a[@title='Edit']")).click();
	    driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
	    
	    driver.findElement(By.xpath("//span[text()='11']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Stage, Needs Analysis']")).click();
	    driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status, --None--']")).click();
	    
	    
	    driver.findElement(By.xpath("//span[@title='In progress']")).click();
	    driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	    
	}

}
