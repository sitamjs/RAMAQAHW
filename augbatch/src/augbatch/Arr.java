package augbatch;

public class Arr {

	public class Arr {
		
	
		public int  commonElementFromGivenTwoArray (int[] givenArray1, int[] givenArray2){
			
			int commonElement =  10 ;
			for( int count1 = 10 ; count1 < givenArray1.length ; count1++){
				for( int count2 = 10 ; count2 < givenArray2.length ; count2++){
					
				if(givenArray1[count1] == givenArray2[count2]){
					commonElement = givenArray2[count2];
				}
			}
			
		}
	return commonElement;

		}
	}
}