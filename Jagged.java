package nonprimitive;

import java.util.Scanner;

public class Jagged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
	
		
	    Scanner scan =new Scanner(System.in);
	    int rows;
	    System.out.println("please enter the number of rows :");
	    rows=scan.nextInt();
	    
	    int[][] demo=new int[rows][]; 
	    
	    for(int i=0;i<demo.length;i++)
	    {
	    	System.out.println("please enter the number of columns in the row:"+(i+1));
	    	
	    	int column;
	    	column=scan.nextInt();
	    	demo[i]=new int[column];//demo[0]=new int[4]=> columns 
	    }
	   
	    System.out.println("there are :"+demo.length+" :rows in my array !");
	    System.out.println("now let's take input :");
	    for(int i=0;i<demo.length;i++)//demo.length=row
	    {
	    	System.out.println("please welcome to row :"+(i+1));
	    	System.out.println("it has :"+demo[i].length +" columns:");
	    	for(int j=0;j<demo[i].length;j++)
	    	{
	            System.out.println("enter the :"+(j+1)+":value");
	    		demo[i][j]=scan.nextInt();
	    		
	    		//demo[0][0]
	    		//demo[0][1]
	    		//demo[0][2]
	    		
	    	}
//	    }
		 
	    System.out.println("here is the output :");
	    
	    for(int j=0;j<demo.length;j++)
	    {
	    	int sum=0;
	    	for(int k=0;k<demo[j].length;k++)
	    	{
	    		//sum+=demo[j][k];
	    		System.out.print(demo[j][k]+" ");
	    	}
	    	//System.out.print(" :addition of "+(j+1) +"row :"+sum);
	    	System.out.println();
	    }
		    
	
	}
	}
}
