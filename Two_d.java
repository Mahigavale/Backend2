package nonprimitive;

import java.util.Scanner;

public class Two_d {

	public static void main(String[] args) {
		 //Ab=>12,34,56,78
		 //Cd=>34,67,89,98
		 //Ef=>12,56,78,56
		
		
		
//		int marks[][]=new int [3][4];
//           marks[0][0]=12;
//           marks[0][3]=78;
//           marks[1][2]=89;
//           marks[2][3]=56;
//           
//           System.out.println(marks);
//           
//           for(int i=0;i<3;i++)
//           {
//        	   for (int j=0;j<4;j++)
//        	   {
//        		   System.out.print(marks[i][j]+" ");
//        	   }
//        	   System.out.println();
//           }
//           
//           System.out.println(marks.length);
//	}
		
		
		System.out.println("***********VILLAGE MANAGEMENT SYSTEM************");
		
		
		int[][] villagers=new int[3][3];
		
		Scanner scan=new Scanner(System.in);
		
		
//		System.out.println("0 -FM");
//		System.out.println("1-LR");
//		System.out.println("2-EC");
		for(int i=0;i<3;i++)//0 member
		{
			System.out.println("please enter for member :"+(i+1));
			for(int j=0;j<3;j++) //0 members properties
			{
				//System.out.println("please enter the :"+ j+ "value");
				if(j==0) //family
				{
					System.out.println("Family :");
				}
				else if(j==1) //land
					{
					 System.out.println("Land:");	
					}
				if(j==2) //electricity
				{
					System.out.println("Electricity:");
				}
				villagers[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("here is the o/p");
		for(int i=0;i<3;i++)
		{
			System.out.println("values for member :"+ i);
			for(int j=0;j<3;j++)
			{
				
				if(j==0)
				{
					System.out.print(" family members:");
				}
				else if(j==1)
				{
					System.out.print(" Land Records :");
				}
				else if(j==2)
				{
					System.out.print(" Electricity :");
				}
				System.out.print(villagers[i][j]);
			}
			System.out.println();
		}
	}

}
