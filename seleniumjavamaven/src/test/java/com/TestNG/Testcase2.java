package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {
	
	WebDriver driver;
	
	@Test(priority=10)
	void launchbrowser() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("launched the browser");
		
	}
	@Test(priority=20)
	void OpenApplication() throws InterruptedException {
		driver.get("https://www.linkedin.com");
		Thread.sleep(5000);
		System.out.println("opened the url in browser");
	}
	@Test(priority=30)
	void login() throws InterruptedException {
		driver.findElement(By.id("session_key")).sendKeys("pkr31121998@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Praveen3125@");
		driver.findElement(By.xpath("//button[@data-id=\"sign-in-form__submit-btn\"]")).click();
		System.out.println("logged in to application");
	}
	
	void clickOnMynetworkBtn() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title=\"My Network\"]")).click();
	}
	@Test(priority=40)
    void closebrowser() {
    	
    	driver.close();
    	System.out.println("closed the browser");
		
		
	}

}
