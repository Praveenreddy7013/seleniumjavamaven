package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		//launching browser
		WebDriver driver =  new ChromeDriver();
		//adding implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//adding declaration part of explicit wait one time
		//WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//maximize browser
		driver.manage().window().maximize();
		//select specific checkbox
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement checkbox =driver.findElement(By.id("monday"));
		checkbox.click();
		Thread.sleep(2000);
		checkbox.click();
		//select all checkboxes
		List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@id,\"day\")]"));
		//System.out.println(checkboxes.size());
		//for( WebElement cbox:checkboxes) {
			//cbox.click();
		
    //select multiple checkboxes based on my choice
		for( WebElement cbox:checkboxes) {
			String value =cbox.getAttribute("id");
			if(value.equals("monday")|| value.equals("tuesday")){
				cbox.click();
			}
	}
		// select last two or three check boxes
		for(int i =checkboxes.size()-3;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}

}}
