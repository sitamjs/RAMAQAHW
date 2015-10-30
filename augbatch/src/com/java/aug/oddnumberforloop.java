package com.java.aug;

public class oddnumberforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int total = 0 ;
		for (int i = 0; i<=20 ; i++){
			if ( i % 2 !=0){
				System.out.println("odd numbers =" +i);
				}
			
			 total  = total +i;
			 
			 
						
		}
		System.out.println("total of the oddnumbers = " +total );
		
	}

}

