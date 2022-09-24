package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteAcco {

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
   driver.findElement(By.xpath("//a[@title='Delete']")).click();
   
    

	}
}