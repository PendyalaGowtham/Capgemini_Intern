import java.util.*;


class withdrawing
{
	private int  a=5000;
	public void withdraw(int b) throws IllegalBankTransactionException,InsufficientBalanceException
	{
		if(b<0)
		{
			throw new IllegalBankTransactionException("should not be negative");
		}
		if(b>a)
		{
			throw new InsufficientBalanceException("Insufficient balance to withdraw");
		}
		System.out.println(b+" withdrawn");
	}
	
}

public class AssignmentException3 {
	
	

	public static void main(String[] args) {
		withdrawing q=new withdrawing();
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdrawing amount:");
		b=sc.nextInt();
		try
		{
			q.withdraw(b);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
			
		}
		catch(IllegalBankTransactionException e)
		{
			System.out.println(e);
			
		}

		

	}

}
