package com.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		
	WebElement desktopmenu=	driver.findElement(By.xpath("//a[.=\"Desktops\"]"));
	WebElement macoption =	driver.findElement(By.xpath("//a[.=\"Mac (1)\"]"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(desktopmenu).moveToElement(macoption).click().perform();
	
	

	}

}
