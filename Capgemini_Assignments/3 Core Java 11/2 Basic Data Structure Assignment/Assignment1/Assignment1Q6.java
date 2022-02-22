package Assignment1;
import java.util.*;
class Login{
	//static int k=0;
    String userId = "Ajay",password = "password";
   // Assingment1Q6 ob=new Assingment1Q6();
    public String loginUser(String user, String pass)
    {
    		if(userId.equals(user) && pass.equals(password))
    		{
    			return "welcome";
    		}
    	/*	else
    		{
    			k++;
    		}*/
    return "NOP";
    }

}
public class Assignment1Q6 
{
    public static void main(String args[]) 
    {
    	String a,b;
   	 int k=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter userId and password ");
    	while(true)
    	{
    		++k;
    	a=sc.nextLine();
    	b=sc.nextLine();
    	Login ib=new Login();
    	String s=ib.loginUser(a, b);
    	if(s.equals("welcome"))
    	{
    	System.out.println(s);
    	break;
    	}
    	if(k==1)
    	{
    		System.out.println("You have entered wrong credentials ,please enter the right credentials");
    		System.out.println("Enter userId and password ");
    	}
    	if(k==2)
    	{
    		if(s.equals("welcome"))
        	{
        	System.out.println(s);
        	}
        	else {
    		System.out.println("You have entered wrong credentials ,please enter the right credentials");
    		System.out.println("Enter userId and password ");
        	}
    	}
    	if(k==3)
    	{
    		System.out.println("You have entered wrong credentials 3 times");
    		System.out.println("contact Admin ");
    		break;
    	}
    	}
    	

    }
}