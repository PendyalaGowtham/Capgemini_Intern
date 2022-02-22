package Assignment2;
// From Assignment2Q3
 
class SavingsAccount extends bank {
    int fixedDepositAmount = 5000;
    public int getCash() {
    	return totalDeposits + fixedDepositAmount;
    }
}
