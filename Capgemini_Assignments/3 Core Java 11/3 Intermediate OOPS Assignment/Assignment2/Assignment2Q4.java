package Assignment2;

/*
 * . Q4Test the following principles of an abstract class:

• If any class has any of its method abstract then you must declare entire class abstract.

• Abstract class cannot be instantiated.

• When we extend an abstract class, we must either override all the abstract methods in sub class or declare subclass as abstract.

• Abstract class cannot be private.

• Abstract class cannot be final.

• You can declare a class abstract without having any abstract method.

Description:-

Write a program in such a way that all the conditions above for abstract class should satisfy.
 */
abstract class AbstractCheck{
	int a = 1;
	public abstract int get();
}

class getCheck extends AbstractCheck{
	public int get()
	{
		return a;
	}
}

abstract class secCheck{
}
 
public class Assignment2Q4 {
	public static void main(String[] args) {
		getCheck obj = new getCheck();
		
		System.out.println(obj.get());
	}

}