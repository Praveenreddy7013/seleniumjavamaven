package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		//launching browser
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		WebElement dropdownelement = driver.findElement(By.xpath("//div[.=\"DropDown practice\"]/following::select"));
		Select country = new Select(dropdownelement);
		country.selectByIndex(3);
		Thread.sleep(3000);
		country.selectByVisibleText("Spain");
		Thread.sleep(3000);
		country.selectByValue("6");
		Thread.sleep(3000);
		List<WebElement> drpdownvalues =country.getOptions();
		System.out.println(drpdownvalues.size());
		for( WebElement drpdownvalue:drpdownvalues) {
			System.out.println(drpdownvalue.getText());
		}
       //select option without using any methods
       for( WebElement drpdownvalue:drpdownvalues) {
    	   if(drpdownvalue.equals("Spain")) {
    		   drpdownvalue.click();
    		   break;
    	   }
       }
      driver.quit();
	}

}
