package com.java.testing;

public class StrReplace{

	public static void main(String[]args){
		// TODO Auto-generated method stub
			  
				    String words = "“hello Erika!”";  
		  
			    String from = "h";  
		   
		 	    String to = "H";  
		  
			    System.out.println(replace(words, from, to));  
		 
			}  
		   
		 		public static String replace(String aInput, String aOldPattern, String aNewPattern)  
		
		 		{
		
		        if ( aOldPattern.equals("") ) {  
		 
		            throw new IllegalArgumentException("Old pattern must have content.");  
		 
		         }  
		 
		  
		  
		
		        final StringBuffer result = new StringBuffer();  
		 
	        int startIdx = 0;  
	  
	         int idxOld = 0;  
		 
	         while ((idxOld = aInput.indexOf(aOldPattern, startIdx)) >= 0) {  
		  
		           result.append( aInput.substring(startIdx, idxOld) );  
		 
		           result.append( aNewPattern );  
	 		   	 
		  	             
		 		          startIdx = idxOld + aOldPattern.length();  
	         }  
		  
			         //the final chunk will go to the end of aInput  
	 
			         result.append( aInput.substring(startIdx) );  
	        return result.toString();  
		
		      }  
	 
		}  
		
		 


		 