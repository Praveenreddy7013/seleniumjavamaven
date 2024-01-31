package com.day10.pac2;

import com.day10.pac1.Test;

public class TestMain extends Test {

	public static void main(String[] args) {
		TestMain t=new TestMain();
		t.m2();//outside of classes we can't access if we define it as private
        System.out.println(t.y);
	}

}
