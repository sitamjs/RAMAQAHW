package com.java.testing;
import java.util.Scanner;
public class multiplelineincrements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		 		     String pattern;
		     int noOfTimes;
		      
		     Scanner scanner = new Scanner(System.in);
		      
		     System.out.print("Enter the pattern to print : ");
		     pattern  = scanner.nextLine();
		      
		     System.out.print("Enter number of times it should get printed : ");
		     noOfTimes = scanner.nextInt();
		 
		     for(int i = 1; i <= noOfTimes; i++) {
		          
		         for(int j = 1; j <= i; j++) { 
		             System.out.print(pattern);
		         }
		         System.out.println();
		     }
	}
}
		 
		
	


