package com.java.testing;
import  java.util.Scanner;
public class pingpong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					  		
		Scanner s = new Scanner(System.in);  
			int nos =  0;  
			System.out.println("plz enter no to see divisable by 3 ,5");  
		 	  
			nos = s.nextInt();  
		 
			if(((nos%5) ==0 ) && ((nos%3) ==0) )  
			 
					System.out.println("number  is  divisable by both 3 and 5!");  
		 
			else if((nos%5) == 0)  
		 	{  
			System.out.println("Number  is  divisible by 5 only!");  
			}  
			else if((nos%3) == 0)  
			{  
				System.out.println("Number  is  divisible by 3 only!");  
			}  
		else  
		{  
		  System.out.println("Number  is not divisible by either 3 or 5!");  
		 
			}  
		}  
			 
		
	}


