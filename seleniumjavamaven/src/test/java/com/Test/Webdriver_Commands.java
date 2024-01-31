package com.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver_Commands {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options = new ChromeOptions();
		//options.setBrowserVersion("117");
		//launching browser
		WebDriver driver =  new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//get commands
		driver.get("https://www.hyrtutorials.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//navigate commands
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		//conditional commands
		System.out.println(driver.findElement(By.id("Header1_headerimg")).isDisplayed());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//browser commands
		driver.quit();

	}

}
