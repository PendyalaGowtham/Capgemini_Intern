package Assignment2;

/**
 * Q3. Write a program to consider saving & current account in the bank. Saving account holder has ‘Fixed Deposits’ whereas Current account holder has cash credit. Apply polymorphism to find out total cash in the bank.
 *
 * Description:-
 *
 * Write a program to claculate the total cash available in the bank. In this bank,bank will provide two types of accounts one is savings accounts and another is current account where current account has cash credits and savings account has fixed deposit options.
 *
 * Specifications:
 *
 * class CurrentAccount extends Assignment2Q3 {
 *     int totalDeposits = 10000;
 *     int creditLimit = 2000;
 *     @Override
 *     public int getCash() {}
 * }
 * class SavingsAccount extends Assignment2Q3 {
 *     int totalDeposits = 10000;
 *     int fixedDepositAmount = 5000;
 *     @Override
 *     public int getCash() {}
 * }
 * public class Assignment2Q3 {
 *     public int totalCashInBank(ArrayList<Integer> cash){}
 *     public int getCash(){}
 *     public static void main(String[] args) {}
 * }
 */

import java.util.ArrayList;

// It also required CurrentAccount, SavingsAcount and bank.java  files

public class Assignment2Q3 {
	public static void main(String[] args) {
    	CurrentAccount ca = new CurrentAccount();
    	SavingsAccount sa = new SavingsAccount();
    	
    	System.out.println(ca.getCash());
    	System.out.println(sa.getCash());
    	System.out.println(ca.getCash() + sa.getCash());
    }
}
