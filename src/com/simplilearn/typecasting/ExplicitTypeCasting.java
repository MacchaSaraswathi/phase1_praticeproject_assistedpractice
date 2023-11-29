package com.simplilearn.typecasting;

public class ExplicitTypeCasting {
	
	// Entry point
	public static void main(String[]args) {
		
		double accBalance = 35445.4545d;
		
		long bigBalance = (long)accBalance;
		
		int intBalance = (int)accBalance;
		
		short shortBalance = (short) bigBalance;
		
		byte byteBalance = (byte)accBalance;
		
		
		System.out.println("Account Balance (double) :" + accBalance);
		System.out.println("Account Balance (long) :" + bigBalance);
		System.out.println("Account Balance (int) :" + intBalance);
		System.out.println("Account Balance (short) :" + shortBalance);
		System.out.println("Account Balance (byte) :" + byteBalance);
		
		
				
		
		
		
	}

}
