package com.java.testing;

public class hashcodeequalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class A {
		      int field1;

		      A(int field1) {
		        this.field1 = field1;
		      }

		      public boolean equals(Object other) {
		        return (other != null && other instanceof A && ((A) other).field1 == field1);
		      }
		    }

		    class B extends A {
		        int field2;

		        B(int field1, int field2) {
		            super(field1);
		            this.field2 = field2;
		        }

		        public boolean equals(Object other) {
		            return (other != null && other instanceof B && ((B)other).field2 == field2 && super.equals(other));
		        }
		    }    
	}

}
