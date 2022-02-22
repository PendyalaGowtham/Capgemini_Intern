package Assignment2;
// From Assignment2Q3
 
class CurrentAccount extends bank {
    int creditLimit = 2000;
    public int getCash() {
    	return totalDeposits +creditLimit;
    }
}