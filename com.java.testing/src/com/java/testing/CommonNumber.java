package com.java.testing;
import java. util.HashSet;
public class CommonNumber {

		
				 	public static void main(String[] args) { 
				// TODO Auto-generated method stub 
		     String[] s1 = {"Rama","One","Two","Three","Four"}; 
		     
	    String[] s2 = {"Rama", "One","Two","Three","Four"}; 
		      
		     
	     HashSet<String> set = new HashSet<String>(); 
		     
		     for(int i = 0 ; i<s1.length ; i++) 
		    {  
		     	for(int j = 0 ; j<s2.length ; j++) 
		     	{ 
		     		if(s1[i].equals(s2[j])) 
		     		{ 
		    			set.add(s1[i]); 
		   		} 
		     	} 
		     } 
		 	System.out.println(set); 
		 	 
			} 
	
		 
}


