package com.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWebTable {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		//how to find no.of rows in a table
		//int rows=driver.findElements(By.xpath("//table[@id=\"countries\"]/tbody/tr")).getSize();//if we have multiple webtables we need to follow this process
		int rows=driver.findElements(By.tagName("tr")).size();
        System.out.println("no of rows"   +   rows);
      //how to find no.of columns in a table
       int columns=driver.findElements(By.xpath("//table[@id=\"countries\"]//th")).size();
       System.out.println("no of columns"  +  columns);
       //Retrieve specific data from table
      String value= driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr[2]/td[2]")).getText();
       System.out.println("data present in 2nd row 1st data :" + "  "+  value);
       //retrieve all rows and columns from a table
       for(int r=1; r<=rows;r++) {
    	   for(int c=1; c<=columns; c++) {
    		   value= driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
    		   System.out.print(value+"     ");
    		  
    	   }
    	   
       }
       */
       //print particular data from table based on my selection
       for(int r=1; r<=rows;r++) {
       String country=driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr["+r+"]/td[2]")).getText();
       if(country.equals("Angola")) {
    	   
    	   String capitals=driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr["+r+"]/td[3]")).getText();
    	   String currency=driver.findElement(By.xpath("//table[@id=\"countries\"]/tbody/tr["+r+"]/td[4]")).getText();
    	   System.out.println(country+" "+capitals+" "+currency);
       }
    	   
       }
       
       
       
       
       
       
       
       
       driver.close();
        
        
        
	}

}
