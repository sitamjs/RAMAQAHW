package com.java.testing;
import java.util.Scanner;
public class Leniarserch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,n,search,array[]; 
				 
		 	 Scanner in = new Scanner(System.in); 
				System.out.println("Enter number of elements in array"); 
		     n =in.nextInt(); 
	    array = new int[n]; 
		      
	      System.out.println("Enter "+ n + " integers"); 
		        
	       for( c=0 ; c< n ; c++) 
	     	  array[c] = in.nextInt(); 
	        
	      System.out.println("Enter value to find position"); 
	      search = in.nextInt(); 
		       
		      for(c = 0 ; c < n ; c++) 
		       { 
		    	  if (array[c] == search) 
		{
			System.out.println(search + " is present at position "+ (c + 1) + "."); 
		     	     break; 
		}
		}
		  	if(c==n) ;

	}

}
