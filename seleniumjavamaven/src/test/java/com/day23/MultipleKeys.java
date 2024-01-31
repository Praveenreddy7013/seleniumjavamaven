package com.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

	public static void main(String[] args) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver =  new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://text-compare.com/");
			
			WebElement inputbox1=driver.findElement(By.id("inputText1"));
			WebElement inputbox2=driver.findElement(By.id("inputText2"));
			inputbox1.sendKeys("welcome");
			
			Actions act=new Actions(driver);
			//ctrl+A
			act.keyDown(Keys.CONTROL);
			act.sendKeys("a");
			act.keyUp(Keys.CONTROL);
			act.perform();
			
			//ctrl+c
			act.keyDown(Keys.CONTROL);
			act.sendKeys("c");
			act.keyUp(Keys.CONTROL);
			act.perform();
			
			//navigate to 2nd input box..press tab key
			act.sendKeys(Keys.TAB);
			act.perform();
			
			
			//ctrl+v
			act.keyDown(Keys.CONTROL);
			act.sendKeys("v");
			act.keyUp(Keys.CONTROL);
			act.perform();
			
			
			
			
			
		
			
			
			
			
			
	}

}
