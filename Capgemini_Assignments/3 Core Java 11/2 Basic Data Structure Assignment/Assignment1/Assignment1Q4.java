package Assignment1;
import java.util.*;
class ResultDeclaration{
    public String declareResults( double s1, double s2, double s3) 
    {
    	if(s1>60 && s2>60 && s3>60)
    	{
    		return "Passed";

    	}
    	if((s1>60 && s2>60) || (s2>60 && s3>60) || (s3>60 && s1>60))
    	{
    		return "Promoted";

    	}
    	if((s1>60 || s2>60 || s3>60) || (s1<60 && s2<60 && s3<60))
    	{
    		return "failed";

    	}
    	return "nothing";
    	
    }
}
public class Assignment1Q4 {

	public static void main(String[] args) {
		ResultDeclaration ob=new ResultDeclaration();
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		String s=ob.declareResults(a,b,c);
		System.out.println(s);

	}

}

