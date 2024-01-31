package com.TestNG;

import org.testng.annotations.Test;

public class SamepleTestNGTc {
	@Test(priority=1)
	void launchapp() {
		System.out.println("launch to application");
	}
	@Test(priority=4)
	void login() {
		System.out.println("login to application");
	}

	@Test(priority=2)
	void logout() {
		System.out.println("logout to application");
	}

	@Test(priority=3)
	void closeapp() {
		System.out.println("close application");
	}


}
