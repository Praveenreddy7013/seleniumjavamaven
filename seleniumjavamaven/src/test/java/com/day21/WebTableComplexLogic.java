package com.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableComplexLogic {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("");
		
		//table
		
		int rows = driver.findElements(By.xpath("//table[@id='rtable']/tbody/tr")).size();
		
		int count=0;
		for(int r=1;r<=rows;r++) {
			String status=driver.findElement(By.xpath("//table[@id='rtable']/tbody/tr["+r+"]\td[5]")).getText();
			
		   if(status.equals("enabled")) {
			   count++;
		   }
		

	}
		System.out.println("no.of enabled users"+count);
		System.out.println("no.of disabled users"+(rows-count));


}
