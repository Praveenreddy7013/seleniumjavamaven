package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		WebElement searchbtn = driver.findElement(By.xpath("//*[@class=\"qsbSubmit\"]"));
		System.out.println(searchbtn.isDisplayed());
		System.out.println(searchbtn.getText());
		
		
		
		
		
		
		//System.out.println(chkbox.isDisplayed());
		//System.out.println(chkbox.getText());
		driver.quit();
		

}}
