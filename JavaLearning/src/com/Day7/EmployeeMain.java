package com.Day7;

public class EmployeeMain {

	public static void main(String[]args) {
		
		//Employee emp1 = new Employee();
		//approach 1 by using object reference variable we assigning data 
		/*emp1.eid=100;
		emp1.name="praveen";
		emp1.job="software engineer";
		emp1.salary=10000;
		Employee emp2 = new Employee();
		emp2.eid=101;
		emp2.name="reshi";
		emp2.job="engineer";
		emp2.salary=20000;*/
		//approach2 using method
		//Employee emp = new Employee();
		//emp.setdata("praveen",101, "java developer", 10000);
		//emp.display();
		//approach3 by using constructor assign data to variables
		Employee emp= new Employee("anil",100,"python devloper",25000);
		emp.display();
		
		
		
		
		
	
	

}

}

