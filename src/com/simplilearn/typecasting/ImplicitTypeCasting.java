package com.simplilearn.typecasting;

public class ImplicitTypeCasting {
	
	
	public static void main(String[]args) {
		
		byte smallCount = 100; //1 byte => =128 to 127
		
		short shortcount = smallCount; // 2 byte => =32768 to 32767
		
		int intcount = shortcount;  // 4 bytes => =2,147,483,648 to 2,147,483,647
		
		long bigcount = intcount;   //implicit type cast => int => long
		
		float floatcount = bigcount;   
		
		double decimalcount = bigcount; 
		
		@SuppressWarnings("unused")
		double decimalcount2 = floatcount;
		
		System.out.println("byte count :" + smallCount);
		System.out.println("integer count :" + intcount);
		System.out.println("short count :" + shortcount);
		System.out.println("long count :" + bigcount);
		System.out.println("float count :" + floatcount);
		System.out.println("double count 1 :" + decimalcount);
		System.out.println("double count 2 :" + decimalcount);
	}
	
			
	

}
