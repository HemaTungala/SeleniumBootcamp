package com.Salesforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SortName {

	
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
			//driver.findElement(By.xpath("//a[@title='Individuals']")).click();
			//driver.findElement(By.xpath("//span[@title='Name']")).click();
		
		List<WebElement> anames=	driver.findElements(By.xpath("//tbody//th//a"));
		List<String> nameslist= new ArrayList<String>();
		for(WebElement element:anames)
		{
			String name=element.getAttribute("title");
			nameslist.add(name);
			
		}
		int size=nameslist.size();
		System.out.println(size);
		Collections.sort(nameslist);
		System.out.println(nameslist);
		JavascriptExecutor js8= (JavascriptExecutor)driver;
		WebElement names=driver.findElement(By.xpath("//span[@title='Name']"));
		 js8.executeScript("arguments[0].click();", names);
		
		
		List<WebElement> enames=	driver.findElements(By.xpath("//tbody//th//a"));
		List<String> enameslist= new ArrayList<String>();
		for(WebElement element:enames)
		{
			String name=element.getAttribute("title");
			enameslist.add(name);
			
		}
		if(nameslist.equals(enameslist))
			System.out.println("List is sorted");
		
	}

		

}
