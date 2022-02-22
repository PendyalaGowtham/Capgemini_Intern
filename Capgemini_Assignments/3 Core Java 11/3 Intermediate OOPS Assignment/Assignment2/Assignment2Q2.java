package Assignment2;
/*
 * 

Q2. Write a program that describes the hierarchy of an organization. Here we need to write 3 classes Employee, Manager & Labour
 where Manager & Labour are the sub classes of the Employee. Manager has incentive & Labour has over time. Add the functionality 
 to calculate total salary of all the employees. Use polymorphism i.e. method overriding.      

Description:-

Write a program to claculate the total salaries given to all the employees by an organization. In this organization there are employees
 category under which Manager and Labour are working where manager will recieve incentive and labourer will receive overtime benifits.

Specifications:

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
    }
}

public class Assignment2Q2 {
    int salary = 10000;
    public int getSalary(int salary){}
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){}
    public static void main(String[] args) {}
}
 */

 
import java.util.ArrayList;

// employee ,Labour , and Manager.java required files

public class Assignment2Q2 {
 
    
    
    public static void main(String[] args) {
    	
    	Labour l = new Labour();
    	Manager m = new Manager();
    	
    	System.out.println(m.getSalary(m.salary));
    	
    	System.out.println(l.getSalary(l.salary));
    	
    	
    }
}