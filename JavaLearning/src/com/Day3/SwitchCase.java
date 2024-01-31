package com.Day3;

public class SwitchCase {

	public static void main(String[] args) {
		int weekno = 6;
		switch(weekno) {
		case 1:System.out.println("sunday");break;//we no need to have curly braces in cases but statement should ends with semicolon
		case 2:System.out.println("monday");break;
		case 3:System.out.println("tuesday");break;
		case 4:System.out.println("wednesday");break;
		case 5:System.out.println("thursday");break;
		case 6:System.out.println("friday"); break;
		case 7:System.out.println("friday"); break;
	    default:System.out.println("inavlid week no");
		}}}//just with 16 lines of code we able to written this code by using switch instead of ifelse ladder
 