import java.util.Scanner;

public class AssignmentException1 {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int dividend=sc.nextInt();
		System.out.println("Enter the second number");
		int divisor=sc.nextInt();
		
		try 
		{
			int result= dividend/divisor;
			System.out.println("The result is :"+result);
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
			System.out.println(" Arthematic Exception occurs. ");
			
		}
		System.out.println(" The code Ends...");

	}

}
