import java.util.Scanner;

public class AssignmentException2 {

	public static void main(String[] args)
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First number");
		int dividend=sc.nextInt();
		System.out.println("Enter the second number");
		int divisor=sc.nextInt();
		
		if(divisor==0)
			throw new UnsupportedOperationException();
		try 
		{
			int result= dividend/divisor;
			System.out.println("The result is :"+result);
			
		} 
		catch (UnsupportedOperationException e)
		{
			e.printStackTrace();
			
		}
		
		
	}

}
