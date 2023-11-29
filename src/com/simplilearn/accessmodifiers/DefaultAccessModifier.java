package com.simplilearn.accessmodifiers;

public class DefaultAccessModifier {
	
	public static void main(String[]args) {
		
		// create an object
		formhouse formhouse = new formhouse();
		
		System.out.println("title :"+formhouse.title);
		System.out.println("price :"+formhouse.price);
		
		formhouse.showdetails();
		formhouse.showprice();
		
		
	}

}

class formhouse {
	
	String title = "open green fram ";
	int chaircount = 100;
    short statuescount = 30;
	byte games = 10;
	float price = 4854.45f;
	
	void showdetails() {
		System.out.println(this.title + "has chair count :"+this.chaircount + "and per day price is : "+this.price);
		
		
	}
	void showprice() {
		System.out.println(this.title + "and per day price is : "+this.price);
		
	}
	
	formhouse(){
		
	}
		
		

}
