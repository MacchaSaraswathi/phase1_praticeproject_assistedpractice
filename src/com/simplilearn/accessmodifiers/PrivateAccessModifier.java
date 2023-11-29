package com.simplilearn.accessmodifiers;

/** 
 * this class demonstrate private access modifier as limited scope to a class
 * @author macchasaraswathi  
 * 
 */
public class PrivateAccessModifier {
	
	public static void main(String[]args) {
		BankAccount account = new BankAccount ();
		account.showName();
		account.showBalance();
		
	}

}

class BankAccount {
	
	private long accNo = 349503348;
	private double accBalance = 45454.4545d;
	private String fullName = "siri maccha";
	private String email = "sir@gmail.com";
	
	@SuppressWarnings("unused")
	private String showEmail1() {
		return this.email;	
	}
	
	public void showBalance() {
		System.out.println("The Account " +this.accNo + "has balance: "+this.accBalance);
		
	}
	
	public void showName() {
		System.out.println("The Account " +this.accNo + "belongs to: "+this.fullName);
		
	}
	
	public BankAccount () {
		
	}

	
}
