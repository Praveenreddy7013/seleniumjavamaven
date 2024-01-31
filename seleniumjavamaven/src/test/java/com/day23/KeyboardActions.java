package com.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);

	}

}
