package com.java.aug;

public class unaryoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =10 ;
		int z = ++x ;  //prefix x= x+1;z=(x=x+1) means z=10+1=11
		System.out.println("the value of z="+z);//output 11
		int z1 = x++;//postfixz1=x;now x=11,postfix x+1=11+1=12
		System.out.println("the value of z1 ="+z1);
		int z2 = x;
		System.out.println("the value of z2 ="+z2);
		}		


	}

