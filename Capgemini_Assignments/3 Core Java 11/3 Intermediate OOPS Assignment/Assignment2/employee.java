package Assignment2;

// from  ques 2Q2

import java.util.*;
public class employee {
	   int salary = 10000;
	    
	    public int getSalary(int salary){
	    	return salary;
	    	
	    }
	    
	    
	    public int totalEmployeesSalary(ArrayList<Integer> es){
	    	int ts = 0;
	    	for(int i=0; i<es.size(); i++)
	    		ts += es.get(i); 
	    		
	    	return ts;
	    }
}