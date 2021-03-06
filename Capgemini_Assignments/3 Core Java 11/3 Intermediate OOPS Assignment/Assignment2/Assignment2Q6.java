package Assignment2;

/*
 * 
Q6. Write an abstract class ‘Persistence’ along with two sub classes ‘FilePersistence’ & ‘DatabasePersistence’. The base class with have an abstract method persist() which will be overridden by its sub classes. Write a client who gets the Persistence object at runtime & invokes persist() method on it without knowing whether data is being saved in File or in Database.

Description:-

Write a program having an abstract class "Persistence" which have two child classes "FilePersistence","DatabasePersistence".The base class will have a persist() method and it is overridden by sub classes.wite a seperate class of client which will get persistence object and invoke persist method on it.(Polymorphism)

Specifications:

abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {}
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {}
}

public class Assignment2Q6 {
    public static void main(String[] args) {}
}


 */
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	return "FilePersistence";
    }
    
    public String persist1() {
    	return "FilePersistence1";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "DatabasePersistence";
    }
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	Persistence obj = new FilePersistence();
    	Persistence obj1 = new DatabasePersistence();
    	System.out.println(obj.persist());
    	System.out.println(obj1.persist());
    }
}