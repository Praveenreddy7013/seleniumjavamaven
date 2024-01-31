package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//screenshot of fullpage
		/*TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		//copy this screenshot into our target location
		File trt=new File(System.getProperty("user.dir")+"\\Screenshots\\homepage.png");
		
		FileUtils.copyFile(src,trt);*/
		
		//screenshot of particular section of the page
		WebElement pagesection=driver.findElement(By.xpath("//div[.=\"File input practice\"]//following::div"));
		File src =pagesection.getScreenshotAs(OutputType.FILE);
       File trt=new File(System.getProperty("user.dir")+"\\Screenshots\\pagesection.png");
		
		FileUtils.copyFile(src,trt);
		
	
		
		
		
		

	}

}
