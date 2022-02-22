package Genericpackage;
/*1) Use a HashSet to hold Employee Objects. Upon running the application, the details of the
employees added to the HashSet should be displayed.
Employee <<class>>
|-- id
|-- name
|-- salary
|-- department
|-- displayDetails()
Feel free to add properties and methods to Employee Class
Note: if we try to store any object other than Employee Object in HashSet, we should not be
allowed to.

*/


// This also want a Employee.java file

import java.util.HashSet;




public class AssignmentGeneric1 
{
	class test
	{
		int a;
		test(int b)
		{
			this.a=b;
		}
		void display()
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) 
	{
		HashSet<Employee> emp =new HashSet<>();
		
		Employee obj = new Employee(1,"Gowtham",2000,"Developer");
		Employee obj1 = new Employee(2,"Mahesh",1500,"QA");
		//test t = new test(4);
		
		emp.add(obj);
		emp.add(obj1);
	   // emp.add(t); // trying to add another object
		
		for(Employee d:emp )
		{
			d.displayDetails();
		}
		
		
		
		
		
		
		

	}

}
