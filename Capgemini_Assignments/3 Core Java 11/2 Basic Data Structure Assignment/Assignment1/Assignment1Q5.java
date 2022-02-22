package Assignment1;
import java.util.*;

class TaxAmount{
    public double calculateTaxAmount(double ctc)
    {
    	if(ctc>0 && ctc<=180000)
    	{
    		return 0;
         }
    	if(ctc>180000 && ctc<= 300000) 
    	{
    		return ctc*0.1;
    	}
    	if(ctc>300000 && ctc<=500000)
    	{
    		return ctc*0.2;
    	}
    	if(ctc>500000 && ctc<=1000000)
    	{
    		return ctc*0.3;
    	}
    	return 0;
   }
 }
public class Assignment1Q5
{
public static void main(String args[]) {
	TaxAmount obj=new TaxAmount();
	System.out.print("Enter ctc=");
	Scanner sc=new Scanner(System.in);
	double c=sc.nextDouble();
	double a=obj.calculateTaxAmount(c);
	System.out.print("Tax amount=");
	System.out.println(a);
	}
}

