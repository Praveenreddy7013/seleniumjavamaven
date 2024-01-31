package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLibraries {

	
	public static void main(String []args) throws InterruptedException  {
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\driver executables\\chromedriver_win32 (1)\\chromedriver.exe");
		//open chrome browser
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");*/
		
		WebDriver driver =  new EdgeDriver();
		//open edge browser:
		
		/*EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new EdgeDriver(options);*/
		//open edge browser:
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		driver.close();
		/*WebElement logo = driver.findElement(By.id("swm-link"));
		
		File src=logo.getScreenshotAs(OutputType.FILE);
		File tgt=new File("C:\\Eclipse project\\seleniumjavamaven\\Downloads");
		FileUtils.copyDirectory(src,tgt);
		/*System.out.println(camerabtn.isDisplayed());
		camerabtn.click();
		Thread.sleep(3000);
		driver.quit();*/
	}}
		