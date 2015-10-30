package augbatch;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//char is in single codes,string in double codes.

		int num = 100 ;
		int num1 ,num2 ;
		
		num1 = 100 ;
		num2 = 200 ;
		num = 150 ;
		
		String name = "Nithya" ;
		String qual = "Java Programer" ;
		System.out.println("Nithya");
        System.out.println("Num Value =" + num);//here we concatenate two values + sign for concatenation the two values.
        //nithya is a java programer out put needs to display.for that we write program like this.
       
        String details = name + " is a " + qual;
        
        System.out.println(details);
           num  = 250 ;
           System.out.println("Num Value =  " + num);
        //if we want change the num value,it will take after changing value.
       //this is keyword called FINAL.
      ///We need to intialise the value in the beginning.
      //constent variable cannot change at any point.
          
        
	}

}
