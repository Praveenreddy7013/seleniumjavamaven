package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		//Actions act=new Actions(driver);
		//WebElement mouseoverEle = driver.findElement(By.xpath("//div[@id=\"nav-tools\"]//a[2]"));
		//act.moveToElement(mouseoverEle);
		Thread.sleep(3000);
		driver.findElement(By.id("session_key")).sendKeys("pkr31121998@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Praveen3125@");
		driver.findElement(By.xpath("//button[@data-id=\"sign-in-form__submit-btn\"]")).click();
		driver.findElement(By.xpath("//span[@title=\"My Network\"]")).click();
		
		//driver.findElement(By.id("ember17")).click();
		Thread.sleep(3000);
		
	 
	  
	  
	  
	  
	  
		
		
		

	}

}
