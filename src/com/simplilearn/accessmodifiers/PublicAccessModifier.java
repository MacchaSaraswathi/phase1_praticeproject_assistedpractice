package com.simplilearn.accessmodifiers;

/** 
 * this class demonstrate public access modifier as widest scope overall.
 * @author macchasaraswathi  
 * 
 */
public class PublicAccessModifier {
	public static void main(String[]args) {
		
		// create an object
		park<?> park = new park<Object>();
		
		System.out.println(park.title);
		System.out.println(park.statuescount);
		
		System.out.println("---------------");
		park.showdetails();
		park.showstatues();
		

		
	}

}

class park<abort>{
	public String title = "public health centre park";
	public int chaircount = 100;
	public short statuescount = 30;
	public byte games = 10;
	
	public void showdetails() {
		System.out.println(this.title + "has chair count : "+this.chaircount +"and statues are : "+this.statuescount);
		
	}
	public void showstatues() {
		System.out.println(this.title + "has total : "+this.statuescount +"statues");
		
	}
	
	
	
}
