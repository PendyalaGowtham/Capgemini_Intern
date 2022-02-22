package Genericpackage;

// this class for AssignmentGeneric1

public class Employee {
	int id=0;
	String name;
	int salary;
	String department;
	
	public Employee(int id,String name,int salary,String department)
	{
		super();
		this.id=id;
		 this.name=name;
		 this.salary= salary;
		 this.department=department;
		
	}


 public void displayDetails()
 {
	 System.out.println(" details are : " + id +" "+name+ " "+ salary+ " "+department);
 }
	 
	 
}