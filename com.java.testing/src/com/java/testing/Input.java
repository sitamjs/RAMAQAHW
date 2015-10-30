package com.java.testing;
import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		 		 
				//prompt for the users name 
				System.out.println("Enter your name:"); 
			 
				//get their input as  a string 
			 
			String username = scanner.next(); 
			 
			
				 
			System.out.println("Enter your age:"); 
			 
		
			int age = scanner.nextInt(); 
				System.out.println(String.format("%s, your age is %d! Play Basketball, Football, Soccer and Kickball Well!!", username , age)); 
		 		} 				
		 
	}


