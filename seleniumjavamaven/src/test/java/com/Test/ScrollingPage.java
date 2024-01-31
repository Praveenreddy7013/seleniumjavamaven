package com.Test;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.linkedin.com");
		driver.findElement(By.id("session_key")).sendKeys("pkr31121998@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Praveen3125@");
		driver.findElement(By.xpath("//button[@data-id=\"sign-in-form__submit-btn\"]")).click();*/
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.title");
		
		driver.close();
		
		//1. scroll down page by pixel
		
		js.executeScript("window.scrollBy(0,3000)", " ");
		double value=(Double)js.executeScript("return window.pageYOffset;" );
		System.out.println(value);

		//2. scroll down till element is visible
		/*WebElement element= driver.findElement(By.xpath("//input[@id=\"serenity\"]//following::label"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		double value=(Double)js.executeScript("return window.pageYOffset;" );
		System.out.println("no of pixels moved is:"+" "+value);*/
		
		//3. scroll down till end of page
		/*js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		double value=(Double)js.executeScript("return window.pageYOffset;" );
		System.out.println("no of pixels moved is:"+" "+value);*/
		
	}

}
