package nonprimitive;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
	
		int[][]students=new int[2][3];
		
		 students[0]=new int[] {33,56,78};//
		 students[1]=new int[] {56,45,67};//
		// students[2]=new int[] {33,45,67};
		 
		 for(int i=0;i<2;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 if(students[i][j]<35)
				 {
					 System.out.print("failed ");
					 
					 continue;
				 }
				 else
				 {
					 System.out.print(students[i][j]+" ");
				 }
			 }
			 System.out.println();
		 }
	}
	

}
