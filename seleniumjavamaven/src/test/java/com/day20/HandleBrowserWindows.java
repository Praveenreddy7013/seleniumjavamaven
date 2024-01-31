package com.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//String windowid=driver.getWindowHandle();
		//System.out.println(windowid);
		driver.findElement(By.linkText("Create a Page")).click();
		
		Set<String>windowids=driver.getWindowHandles();
		//1st approach(by using arraylist concept)
		List<String> windowidslist= new ArrayList(windowids);//converting set into list collecton because we can't get values in set using get method
		String parentwindowid =windowidslist.get(0);
		String childwindowid =windowidslist.get(1);//error(we have to use appli which will be having 2 or more windows)
		System.out.println(parentwindowid);
		System.out.println(childwindowid);
		
		driver.switchTo().window(childwindowid);
		System.out.println("Title of childwindowid" + driver.getTitle());
		
		driver.switchTo().window(parentwindowid);
		System.out.println("Title of parentwindowid" + driver.getTitle());
		
		//approach2(using looping statement
		for(String winid:windowids) {
			System.out.println(winid);
			System.out.println(driver.switchTo().window(winid).getTitle());
		}
		//close specific browser window
		for(String winid:windowids) {
			String title=driver.switchTo().window(winid).getTitle();
			
			if(title.equals("title of 1st window | 2nd window title | 3rd window title"));
			driver.close();
		}
		
		
		
		
		
		
		
		
		

	}

}
