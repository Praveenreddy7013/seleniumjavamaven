package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	    WebElement indiabtn=driver.findElement(By.xpath("//span[normalize-space(. =\"                    India                 \")and @id=\"glow-ingress-line2\"]"));
       System.out.println(indiabtn.isDisplayed());
       Thread.sleep(4000);
       driver.close();
       }

}
