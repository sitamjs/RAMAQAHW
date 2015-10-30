package com.java.testing;
import java.util.Arrays; 
 import java.util.BitSet; 
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one missing  no 

printMissingNumber(new int[]{1,2,3,4,6},6); 
	//two missing no 
		printMissingNumber(new int[]{1,2,3,4,6,7,9,8,10},10); 
	 
		//three missing no 
 		printMissingNumber(new int[]{1,2,3,4,6,9,8},10); 
	 
		 
	//four Missing no 
		 
		 
	//only one missing no in array 
		int[] iArray = new int[]{1,2,3,5}; 
 		int missing = getMissingNumber(iArray, 5); 
 		System.out.printf("Missing number in array %s  is %d %n ", Arrays.toString(iArray), missing); 
	} 

 	 
 	private static void printMissingNumber(int[] numbers, int count) { 
		 
 		int missingCount = count - numbers.length; 
 		BitSet bitSet = new BitSet(count); 
 		 
		for(int number : numbers){ 
 			bitSet.set(number - 1); 
	} 
		System.out.printf("Missing no in integer array %s, with total %d elements is %n", 
				 				Arrays.toString(numbers),count); 
				 
		int lastMissingIndex = 0; 
		 
 		for (int i= 0 ; i<missingCount ; i++) { 
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex); 
 			System.out.println(++lastMissingIndex); 
 			 
		} 
 	} 

 
     private static int getMissingNumber(int[] numbers, int totalCount){ 
 	 
	int expectedSum =totalCount * ((totalCount + 1) / 2); 
 	int actualSum  = 0; 
 	for(int i : numbers) { 
	 
 		actualSum += i ; 
	} 
 	return expectedSum - actualSum; 
 } 
 } 
 







