package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    
    private boolean isExtraCheeseAdded= true;
    private boolean isExtraToppingsAdded=true;
	private boolean isPapperBagAdded = true;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
        	price = 300; 
        	bill = "Base Price Of The Pizza: "+price+"\n";
        }else {
        	price = 400;
        	bill = "Base Price Of The Pizza: "+price+"\n";
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
    	
		if(isExtraCheeseAdded) {
    		price = price+80;
			isExtraCheeseAdded = false;
		}
    }

    public void addExtraToppings(){
        
		// your code goes here
    	if(isExtraToppingsAdded) {
    		if(isVeg)
    		price = price+70;
    		else
    		price = price+120;
    	isExtraToppingsAdded = false;
    	}
    	
    }

    public void addTakeaway(){
        // your code goes here
    	if(isPapperBagAdded) {
    		price = price+20;
    		isPapperBagAdded = false;
    	}
    	
    }

    public String getBill(){
        // your code goes here
    	if(isExtraCheeseAdded == false)
    		bill = bill+"Extra Cheese Added: "+80+"\n";
    	if(isExtraToppingsAdded == false) {
    		if(isVeg)
    			bill = bill+"Extra Toppings Added: "+70+"\n";
    		else
    			bill = bill+"Extra Toppings Added: "+120+"\n";
    	}
    	if(isPapperBagAdded == false)
    		bill = bill+"Paperbag Added: "+20+"\n";
    	bill = bill+"Total Price: "+price+"\n";
        return this.bill;
    }
}
