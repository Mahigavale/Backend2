package nonprimitive;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//user Mobile number=> 5 =>accepted
		// enter the  valid number 
		
		int[] number=new int[] {1,2,3,4,5,78};
		//number[5]=>size =>5 [0,1,2,3,4]
		//4=> 6=>
		
		
	 if(number.length==5)
	 {
		 System.out.println("right number !");
	 }
	 else
	 {
		 System.out.println("wrong input !");
	 }
	 
	 
	System.out.println((number.length==5)? "right":"wrong");

		
	}

}
