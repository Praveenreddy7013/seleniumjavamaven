package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
/*
sanity

openUrl
login
regression

search
advancedsearch
sanity+regression

logout*/

public class Grouping {
	
	@Test(priority=1,groups= {"sanity"})
	void openUrl() {
		
		Assert.assertEquals(1, 1);
	}

@Test(priority=2 ,groups= {"sanity"})
void login() {
	
	Assert.assertEquals(1, 1);
	
}
@Test(priority=3,groups= {"regression"})
void search() {
	
	Assert.assertTrue(true);;
	
}

@Test(priority=4,groups= {"regression"})
void advancedsearch() {
	
	Assert.assertTrue(true);;
	
}
@Test(priority=5,groups= {"sanity","regression"})
void logout() {
	
	Assert.assertEquals(1, 1);
	
}




}
