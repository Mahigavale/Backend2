package nonprimitive;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		System.out.println("*****************THE NUMBER CHECK********************");
		//7774834341=> 7,7,7,4,8,3,4,3,4,1
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please tell me the number of digits:");
		int digits=scan.nextInt(); 
		
		int number[]=new int[digits];//8
		//0-7 =>indices (Last_index<length)
		//8=>length (last_index=length-1)(last_index <length-1)
		
		for(int i=0;i<=number.length-1;i++)
		{
			System.out.println("please enter the:"+ i+" : digit");
			number[i]=scan.nextInt();
		}
		
		System.out.println("your number is:");
		for(int i=0;i<=number.length-1;i++)
		{
			System.out.print(number[i]+" ");
		}
		
		
		System.out.println("program done!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int number[]=new int[3];
//		
//		System.out.println("please enter the first digit:");
//		int num1=scan.nextInt();
//		System.out.println("please enter the second digit:");
//		int num2=scan.nextInt();
//		System.out.println("please enter the third digit :");
//		int num3=scan.nextInt();
//		number[0]=num1; 
//		number[1]=num2;
//		number[2]=num3;
//		System.out.println("your number is:");
//		System.out.println(number[0]);
//		System.out.println(number[1]);
//		System.out.println(number[2]);
		
	}

}
