package com.Day7;

public class Employee {
		//varaibles
		String name;
		int eid ;
		String job;
		int salary;
		//methods
		void display()
		{
			System.out.println(name);
			System.out.println(eid);
			System.out.println(job);
			System.out.println(salary);}
			
			void bonus()
			{
			System.out.println((salary*10)/100);
		}
			Employee(String nm,int id, String jb, int sal) {
				name=nm;
				eid=id;
				job=jb;
				salary=sal;
				
				
			}
			void setdata(String nm,int id, String jb, int sal) {
				name=nm;
				eid=id;
				job=jb;
				salary=sal;
				
				
			}
			
}