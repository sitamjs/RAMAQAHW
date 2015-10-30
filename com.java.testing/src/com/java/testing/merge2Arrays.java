package com.java.testing;

public class merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] queue1 = {4,7,2,9,12,35,8,49};
	    int [] queue2 = {24,53,6,19,41,71,1,68,11,32,99};        
	    int[]mergeQ = new int[queue1.length + queue2.length];

	    for(int i=0; i < queue1.length; i++ )
	    {

	      mergeQ[i*2] = queue1[i];       
	      mergeQ[i*2+1] = queue2[i];  
	    }
	    for(int i=0; i < mergeQ.length; i++) {            
	        System.out.print(mergeQ[i]+",");
	    }
	}

}
