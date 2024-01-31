package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		
		//whenver we do browser settings we have to use this class
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		ChromeDriver driver=new ChromeDriver(options);
		//for edge browser also same we have to use edgeoptions class
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
