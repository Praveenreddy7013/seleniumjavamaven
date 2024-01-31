package com.Test;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		Set<Cookie>cookies=driver.manage().getCookies();//import cookie class from org.openqa.selenium
		System.out.println("size of cookies" + " "+cookies.size());
		//print cookies from browser
		for(Cookie c:cookies) {
			System.out.println(c.getName()+":"+c.getValue());
		}
		//how to add cookie to browser
		Cookie cookieobj=new Cookie("mycookie","123456");
		//we have to add this object
		driver.manage().addCookie(cookieobj);
		System.out.println("size of cookies after adding newone" + " "+cookies.size());
		for(Cookie c:cookies) {
			System.out.println(c.getName()+":"+c.getValue());
		}
		//delete specific cookie from browser
		driver.manage().deleteCookie(cookieobj);
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies after deletion" + " "+cookies.size());
		//delete all cookies in one shot
		driver.manage().deleteAllCookies();
		cookies=driver.manage().getCookies();
		System.out.println("size of cookies after deletion all cookies" + " "+cookies.size());
		
		driver.close();

	}

}
