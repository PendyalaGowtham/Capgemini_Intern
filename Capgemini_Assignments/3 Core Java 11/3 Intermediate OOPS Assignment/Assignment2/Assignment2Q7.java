package Assignment2;
/*
 *
Q7. Develop an application for Dessert shop. The application should allow owner to add items like Candy, Cookie or Ice Cream in the shop storage. Also customers should be able to place an order.

DessertItem is an abstract class having an abstract method getCost(). Every dessert item has tax associated. Candy item is sold in dollar currency, Cookie in Euro currency & Ice Cream in Rupees currency. The sub classes are supposed to override these methods. When we run the application, it should ask us our role i.e. owner or customer. If role is owner, we should be able to add dessert items in our storage. If role is customer, then we should be able to place an order. The currency conversion rates are:

1 dollar = 60 rupees.

1 euro = 70 rupees.

Specifications:-

abstract class DesertItem {

    abstract public int getCost();
}
class Candy extends DesertItem {
    public int addCandies(int candies){}
}
class Cookie extends DesertItem {
    public int addCookies(int candies){}
}
class IceCream extends DesertItem {
    public int addIceCreams(int candies){}
}
public class Assignment2Q7 {
    public static void main(String[] args) {}
    private void selectRoles(){}
    private void roles(String role){}
    private void addItems() {}
    private void addItemsOperation(int choice) {}
    private void placeOrder() {}
    private void placeOrderOperation(int choice) {}
}


 */
import java.util.*;

// Required Candy,Cookie,DesertItem and IceCream.java files

public class Assignment2Q7 {
	Scanner sc = new Scanner(System.in);
    private void selectRoles(){
    	System.out.println("Enter the role 1 for Owner and 2 for Customer");
    	
    	int x = sc.nextInt();
    	if(x == 1)
    		roles("Owner");
    	else if(x == 2)
    		roles("Customer");
    	else
    		System.out.println("Undefined");
    }
    private void roles(String role){
    	if(role == "Owner")
    	{
    		addItems();
    	}
    	else
    	{
    		placeOrder();
    	}
    }
    private void addItems() {
    	System.out.println("Enter the choice to add "+'\n'+"1. Candy" + '\n' + "2. Cookie" + '\n' + "3. Ice Cream");
    	addItemsOperation(sc.nextInt());
    }
    private void addItemsOperation(int choice) {
    	System.out.println("Enter the number of item to be added");
    	int n = sc.nextInt();
    	
    	if(choice == 1)
    	{
    		Candy obj = new Candy();
    		obj.addCandies(n);
    	}
    	else if(choice == 2)
    	{
    		Cookie obj = new Cookie();
    		obj.addCookies(n);
    	}
    	else if(choice == 3)
    	{
    		IceCream obj = new IceCream();
    		obj.addIceCreams(n);
    	}
    	else
    		System.out.println("Wrong input");
    	selectRoles();
    }
    private void placeOrder() {
    	System.out.println("Enter the choice to buy "+'\n'+"1. Candy" + '\n' + "2. Cookie" + '\n' + "3. Ice Cream");
    	placeOrderOperation(sc.nextInt());
    	
    }
    private void placeOrderOperation(int choice) {
    	System.out.println("Enter the number of item to buy");
    	int n = sc.nextInt();
    	if(choice == 1)
    	{
    		Candy obj = new Candy();
    		System.out.println("Total pice is : "+ (n*obj.getCost()));
    	}
    	else if(choice == 2)
    	{
    		Cookie obj = new Cookie();
    		System.out.println("Total pice is : "+ (n*obj.getCost()));
    	}
    	else if(choice == 3)
    	{
    		IceCream obj = new IceCream();
    		System.out.println("Total pice is : "+ (n*obj.getCost()));
    	}
    	else
    		System.out.println("Wrong input");
    	selectRoles();
    }
    
    public static void main(String[] args) {
    	
    	Assignment2Q7 obj=new  Assignment2Q7();
		obj.selectRoles();    	
    }
}