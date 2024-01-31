package com.Test;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//launching browser
		ChromeDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		//get commands
		driver.get("https://www.hyrtutorials.com/");
		

	}
		   public static WebElement waitForElementWithFluentWait(WebDriver driver, final By locator) {
			   
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(Duration.ofSeconds(30L))
	       .pollingEvery(Duration.ofSeconds(5L))
	       .ignoring(NoSuchElementException.class);

	   WebElement element = wait.until(new Function<WebDriver, WebElement>() {
	     public WebElement apply(WebDriver driver) {
	       return driver.findElement(locator);
	     }
	   });
	   
	   return element;
	   
		 



}}