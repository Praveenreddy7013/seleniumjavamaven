package com.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFrames {
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver =  new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
            driver.switchTo().frame("packageListFrame");//switched to 1st frame
            driver.findElement(By.linkText("org.openqa.selenium")).click();
            driver.switchTo().defaultContent();//this will go to mail page
            
            driver.switchTo().frame("packageFrame");//switch to 2nd frame
            driver.findElement(By.xpath("//span[.=\"WebDriver\"]")).click();
            driver.switchTo().defaultContent();//this will go to mail page
            driver.switchTo().frame("classFrame");///switch to 3rd frame
            driver.findElement(By.xpath("//a[.=\"Help\"]"));
            driver.switchTo().defaultContent();//this will go to mail page
            driver.close();
            
	}

}
