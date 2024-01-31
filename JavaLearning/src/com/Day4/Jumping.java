package com.Day4;

public class Jumping {
	public static void main(String args[]) {
		//print 1 to 10 numbers and if i value becomes 5 forcefully exit from loop..
		//i don't want to change condition/depend on this condition as soon as i value becomes 5 exit from loop
		/*for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
				System.out.println(i);
			}
		System.out.println("Program exited");*/
		for(int i=1;i<=10;i++) {
			if(i==3||i==5||i==9) {
				continue;
			}
				System.out.println(i);
			}
		System.out.println("Program exited");
		}
	}


