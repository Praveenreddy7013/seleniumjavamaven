package com.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		//launching browser
		WebDriver driver =  new ChromeDriver();
		//adding implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//adding declaration part of explicit wait one time
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//maximize browser
		driver.manage().window().maximize();
		//get commands
		driver.get("https://www.hyrtutorials.com/");
		//adding explicit wait for all whichever elements we want to be wait
		WebElement titlebtn=explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Header1_headerimg")));
		 By elementlocator=By.id("Header1_headerimg");
		 //calling the method
		 waitForElementPresent(driver,elementlocator,10).click();
		//System.out.println(titlebtn.isDisplayed());
		driver.quit();
		
		

	}
	//user defined function for explicit wait
public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {

    WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    explicitwait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return driver.findElement(locator);}}






