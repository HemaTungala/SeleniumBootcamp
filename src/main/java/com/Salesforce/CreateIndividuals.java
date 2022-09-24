package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateIndividuals {

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
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Individuals");
		driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
        driver.findElement(By.xpath("(//span[text()='Individuals'])[1]//following::lightning-primitive-icon[1]")).click();

        driver.findElement(By.xpath("//span[text()='New Individual']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Hema");
        
        driver.findElement(By.xpath("//button[@title='Save']")).click();
        
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
        
        


		
		
		
	

	}

}
