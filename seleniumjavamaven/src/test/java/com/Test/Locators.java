package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		List<WebElement> username= driver.findElements(By.xpath("//input[@maxlengt = \"10\"]"));
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.linkText("Sign in into account")).isDisplayed());
		//System.out.println(driver.findElement(By.partialLinkText("into account")).isDisplayed());
		//List <WebElement> links =driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//driver.findElement(By.cssSelector(".facebook")).click();
	driver.close();
	
		
		

	}

}
