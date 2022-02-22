package Assignment2;


//Ques Assignment2Q7


class Cookie extends DesertItem {
	int price = 2;
	int total = 0;
    public int addCookies(int candies){
    	total += candies;
    	return total;
    }
    
    public int getCost() {
    	return (price*70); 
    }
}