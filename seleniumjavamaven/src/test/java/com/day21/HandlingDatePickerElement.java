package com.day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingDatePickerElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		String year="2023";
		String date="1";
		String month="October";
		
		driver.switchTo().frame(0);//switch to frame
		//direct approach using sendkeys method
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/02/2021");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//month and year seleection
		while(true) {
  
			  String mon =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		      String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
               if(mon.equals(month)&&yr.equals(year)) {
            	   break;
               }
            	   else {
            		   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            	   }
               }
		//date selection
		List<WebElement>alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:alldates) {
			
			String dt=ele.getText();
			if(dt.equals(date)) {
			ele.click();
			break;
			
		}
	}

}}
