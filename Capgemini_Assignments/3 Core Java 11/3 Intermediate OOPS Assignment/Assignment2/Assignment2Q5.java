package Assignment2;

/**
 * . Write the classes Line, Rectangle, Cube etc. & make the Shape as their base class. Add an abstract draw() method in the class 
 * Shape & draw all shapes.
 *
 * Description:-
 *
 * Write a java class named Shape which has abstract draw() and also classes Line, Rectangle, Cube etc. 
 * extends Shape to implement the draw method.
 *
 * Specifications:-
 *
 * class Rectangle5 extends Shape5 {
 *     @Override
 *     public String draw() {}
 * }
 *
 * class Line5 extends Shape5{
 *     @Override
 *     public String draw() {}
 * }
 *
 * class Cube5 extends Shape5 {
 *     @Override
 *     public String draw() {}
 * }
 * abstract class Shape5 {
 *     abstract public String draw();
 * }
 * public class Assignment2Q5{
 *     public static void main(String[] args) {}
 * }
 */

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	Shape5 l = new Line5();
    	Shape5 r = new Rectangle5();
    	Shape5 c = new Cube5();
    	
    	System.out.println(l.draw());
    	System.out.println(r.draw());
    	System.out.println(c.draw());
    }
}
