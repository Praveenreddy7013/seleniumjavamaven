package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBootstrapDrpdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//launching browser
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.id("menu1")).click();
		List<WebElement>values=driver.findElements(By.xpath("//a[@role=\"menuitem\"]"));
		System.out.println(values.size());
		for(WebElement value:values) {
			System.out.println(value.getText());
		}
		
       driver.quit();
	}

}
