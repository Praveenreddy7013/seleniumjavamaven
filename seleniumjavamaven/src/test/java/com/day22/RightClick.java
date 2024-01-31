package com.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jquery-contextMenu/demo.html");
		
		WebElement button=driver.findElement(By.xpath("jjjjjjj"));
		WebElement doubleclkbtn=driver.findElement(By.xpath("jjjjjjj")); 
		Actions act = new Actions(driver);
		act.contextClick(button).perform();//perform rightclick action
		act.doubleClick(doubleclkbtn).perform();//perform double click
		act.dragAndDrop(button, doubleclkbtn).perform();//perform drag and drop
		
		//sliders
		WebElement minslider=driver.findElement(By.xpath("jjjjjjj"));
		WebElement maxslider=driver.findElement(By.xpath("jjjjjjj"));
		System.out.println(minslider.getLocation());//x-axis 59 and y-axis 251
		System.out.println(minslider.getLocation());//x-axis 766 and y-axis 251
		
		act.dragAndDropBy(minslider, 100, 0).perform();
		act.dragAndDropBy(maxslider, -40, 0).perform();
		
		System.out.println(minslider.getLocation());//x-axis 158 and y-axis 251
		System.out.println(minslider.getLocation());//x-axis 723 and y-axis 251
		
		
		
		
		
		
		

	}

}
