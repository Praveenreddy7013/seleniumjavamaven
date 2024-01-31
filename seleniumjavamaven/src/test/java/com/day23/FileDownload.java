package com.day23;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class FileDownload {

	public static void main(String[] args) {
		
		//String location="C:\\Eclipse project\\seleniumjavamaven\\Downloads";
		String location=System.getProperty("user.dir")+"\\Downloads";//to get current project location/directory we use this method
		
		//chrome browser
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs",preferences );
		WebDriver driver=new ChromeDriver(options);
		
		
		//edge
		
		HashMap preferences=new HashMap();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("prefs",preferences );
		WebDriver driver=new ChromeDriver(options);
		
		//fireforx
		
		FirefoxProfile profile= new FirefoxProfile();
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");//mime type
		profile.setPreference("browser.download.folderList", 2);//0-desktop 1-downloads 2-desired location
		profile.setPreference("browser.download.dir", location);
		
		FirefoxOptions options= new FirefoxOptions();
		options.setProfile(profile);
		
		
		
		
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//table[@id=\"table-files\"]//td[5]/a"))).click().perform();
        
	}

}
