package Genericpackage;

import java.util.HashMap;

/*
 * Write an application to hold 10 random int values as keys and 10 random double values as
values for a HashMap. Print the data store in the HashMap. Note: Keys can only be int and
values double
 */

public class AssignmentGeneric2 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Double> obj =new HashMap<Integer,Double>(10);
		obj.put(35,170.09);
		obj.put(28,450.45);
		obj.put(89,125.52);
		obj.put(42,350.52);
		obj.put(1,982.88);
		obj.put(21,425.25);
		obj.put(13,350.85);
		obj.put(74,70.49);
		obj.put(89,17.52);
		obj.put(9,7.79);
		
		System.out.println(obj);
	
	
}
}
