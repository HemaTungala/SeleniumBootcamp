package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditAcco {

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
	    driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Hema"+Keys.ENTER);  
	    //Thread.sleep(5000);
	    //JavascriptExecutor je = (JavascriptExecutor)driver;
	     WebElement editbutton =driver.findElement(By.xpath("//tbody/tr/td[6]//a"));
	   
	    //je.executeScript("arguments[0].scrollIntoView();", edit);	   
	   editbutton.click();
	   
	   
	   driver.findElement(By.xpath("//div[@title='Edit']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Type, --None--']")).click();
	    
	    driver.findElement(By.xpath("//span[@title='Technology Partner']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Industry, --None--']")).click();
	    JavascriptExecutor js4 = (JavascriptExecutor) driver;
	    
	       //specify the WebElement till which the page has to be scrolled
	       WebElement element =  driver.findElement(By.xpath("//span[@title='Healthcare']"));
	 
	       js4.executeScript("arguments[0].scrollIntoView();", element);
	    //driver.findElement(By.xpath("//span[@title='Healthcare']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status, --None--']")).click();
	    
	    
	    driver.findElement(By.xpath("//span[@title='In progress']")).click();
	    driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Salesforce");
	    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

}
