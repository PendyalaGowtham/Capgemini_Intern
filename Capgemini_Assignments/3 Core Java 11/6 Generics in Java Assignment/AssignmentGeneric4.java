package Genericpackage;

import java.util.*;

/*
 * 4) Design a class named Pair which has two properties. The name of the first property is key
      and that of the second property is value. When designing the class take case of the following scenarios:
     a. Create an Object of Pair class to store String value for the property key and String
        value for the property value. Restriction Apart from String type no other types should
         be acceptable as Key or value input
          e.g.
            myObj.setKey(“1”);
            myObj.setValue(“Hello”);
     b. Create an object of the class Pair to store String value for the property key and
         java.util.Date as value for the property value
         myObj.setKey(“Today is”);
         myObj.setValue(new java.util.Date());
    Note: In scenario a. no data apart from String should be used for key and value, in scenario b.
      no data apart from String for key and java.util.Date should be allowed
 */
class pair<T1, T2> 
{
	T1 a;
	T2 b;
	public T1 getkey() {
		return a;
	}
	public void setkey(T1 a) {
		this.a = a;
	}
	public T2 getvalue() {
		return b;
	}
	public void setvalue(T2 b) {
		this.b = b;
	}


}
public class AssignmentGeneric4 {
	
	public static void main(String[] arg)
	
	{
		// a
		
		pair<String,String> obj =new pair<String,String>();
		obj.setkey("1");
		obj.setvalue("Hello");
	//    obj.setkey(1);  // not accepting the int types
	//    obj.setvalue(1);
		
		System.out.println(obj.getkey());
		System.out.println(obj.getvalue());
		
		
		// b
		
		pair<String,Date> obj1=new pair<>();
		obj1.setkey("Today is ");
		obj1.setvalue(new Date());
	//	obj1.setkey(1);  // not accepting the int data type
		
		System.out.println(obj1.getkey());
		System.out.println(obj1.getvalue());


	}
}
