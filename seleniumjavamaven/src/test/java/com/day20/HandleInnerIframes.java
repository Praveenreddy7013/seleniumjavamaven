package com.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleInnerIframes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(outerframe);//switch to outer frame
	    
	    WebElement innerframe=driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
	    driver.switchTo().frame(innerframe);//switch to inner frame
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("praveen");
	    Thread.sleep(5000);
	    driver.close();
	    
	    
	    
	    
}
}