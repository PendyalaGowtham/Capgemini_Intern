package Assignment1;
import java.util.*;
class SiCi
{
	public double simpleInterest(double p,int t,double i)
	{
		double a=(p*i*t)/100;
		return a;
	}
	public double compoundInterest(double p,int t,double i)
	{
		double b=Math.pow(p*(1+i),t-p);
		return b;
	}
}
public class Assignment1Q3 {

	public static void main(String[] args) {
		
SiCi ob=new SiCi();
int p,r,t;
Scanner sc=new Scanner(System.in);
p=sc.nextInt();
r=sc.nextInt();
t=sc.nextInt();
double a=ob.simpleInterest(p,t,r);
double b=ob.compoundInterest(p, t, r);
System.out.println(a);
System.out.println(b);
	}

}
