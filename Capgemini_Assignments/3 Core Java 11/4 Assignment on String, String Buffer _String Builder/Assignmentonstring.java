
public class Assignmentonstring {
	

	public static void main(String[] args) {
		
		// ques 1
		System.out.println("  ");
        System.out.println(" ---------------Question 1 --------------");
        System.out.println("  ");
        
		String str="Hello world";
		System.out.println(str);
		
		// ques 2
		System.out.println("  ");
        System.out.println(" ---------------Question 2 --------------");
        System.out.println("  ");
        
		String s1="Hello ";
		 s1=s1.concat("How are you");
		 System.out.println(s1);
		
		 // ques 3
		 System.out.println("  ");
         System.out.println(" ---------------Question 3 --------------");
         System.out.println("  ");
         
		 String s2="Java String pool refers to collection of Strings which are stored in heap memory";
		 System.out.println("Orginal String = "+s2);
		 // a
		 String s3=s2.toLowerCase();
		 System.out.println("Lower case = "+s3);
		 // b
		 String s4=s2.toUpperCase();
		 System.out.println("Upper case = "+s4);
		 //c
		 String s5=s2.replace('a', '$');
		 System.out.println(s5);
		 //d
		 if(s2.contains("collection"))
		 {
			 System.out.println("Collection word is there");
		 }
		 else
		 {
			 System.out.println("Collection word is not there");
		 }
		 
		 //e
		 String s6="java string pool refers to collection of strings which are stored in heap memory";
		 if(s6.equals(s2))
		 {
			 System.out.println("Matches with the orginal String");
		 }
		 else
		 {
			 System.out.println("Not Match with the orginal String");
		 }
		 //f  using the casesensitive method
		 if(s6.equalsIgnoreCase(s2))
		 {
			 System.out.println("Matches with the orginal String using ignore case");
		 }
		 else
		 {
			 System.out.println("Not Match with the orginal String");
		 }
		 
		// ques 4
		 System.out.println("  ");
         System.out.println(" ---------------Question 4 --------------");
         System.out.println("  ");
		 
		 System.out.println("  ");
         System.out.println(" -------Using the StringBuffer class---------- ");
         System.out.println("  ");
		  // Assignment onStringBuffer
		   // 1
		 StringBuffer s7 = new StringBuffer("StringBuffer");
		 s7.append(" is a peer class of String");
		 s7.append(" that provides much of");
		 s7.append(" the functionality of strings");
		 System.out.println(s7);
		 
		 //2
		 StringBuffer s8=new StringBuffer("It is used to  at the specified index position");
		 System.out.println(s8);
		 s8.insert(14, "insert text");
		 System.out.println(s8);
		 
		 //3
		 
		StringBuffer s9=new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println("Before reversing the string :: "+s9);
		s9.reverse();
		System.out.println("After reversing the string :: "+s9);
	
		
           System.out.println("  ");
           System.out.println(" ---------Using the StringBuilder class-------------- ");
           System.out.println("  ");
		  // Assignment onStringBuilder
		   // 1
		 StringBuilder s10 = new StringBuilder("StringBuffer");
		 s10.append(" is a peer class of String");
		 s10.append(" that provides much of");
		 s10.append(" the functionality of strings");
		 System.out.println(s10);
		 
		 //2
		 StringBuilder s11=new StringBuilder("It is used to  at the specified index position");
		 System.out.println(s11);
		 s11.insert(14, "insert text");
		 System.out.println(s11);
		 
		 //3
		 
		StringBuilder s12=new StringBuilder("This method returns the reversed object on which it was called");
		System.out.println("Before reversing the string :: "+s12);
		s12.reverse();
		System.out.println("After reversing the string :: "+s12);
	

	}

}
