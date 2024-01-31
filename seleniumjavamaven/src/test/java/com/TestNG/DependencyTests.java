package com.TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTests {
	
	@Test(priority=1)
	void openUrl() {
		
		Assert.assertEquals(1, 1);
		
	}
	/*@Test
	void login() {
		if(false) {
			
			System.out.println("passed");
			
		}else
		{
			System.out.println("failed");
			
		}*/
	@Test(priority=2 ,dependsOnMethods= {"openUrl"})
	void login() {
		
		Assert.assertEquals(1, 2);
		
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search() {
		
		Assert.assertTrue(true);;
		
	}
	
	@Test(priority=4,dependsOnMethods= {"login" ,"search"})
	void advancedsearch() {
		
		Assert.assertTrue(true);;
		
	}
	@Test(priority=5,dependsOnMethods= {"login"})
	void logout() {
		
		Assert.assertEquals(1, 1);
		
	}
	

}
