package Genericpackage;

/*
 * 3) Write a generic method to exchange the positions of two 
 *     different elements in an array.
 */
public class AssignmentGeneric3 {
	
	
	
	public static void main(String[] args) {
		
		Integer [] array = {1,2,3,4,5,6,7,8};
		
		swap<Integer> n=new swap<Integer>();
		Integer  x[]=n.swap1(array, 2,3 );
		for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		
		
		

	}

	

}
