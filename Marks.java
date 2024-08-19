package demo;

public class Marks {

	public static void main(String[] args) {

		
		int[][]marks=new int [3][3];
		
		marks[0]=new int[] {35,56,78};
		marks[1]=new int [] {38,53,12};
		marks[2]=new int[] {67,34,89};
		//float percentage;
		
		for(int i=0;i<marks.length;i++)//<student
		{
			//int sum=0;
			for(int j=0;j<marks[i].length;j++)//marks of student
			{  
				int sum2=0;
				
				if(marks[i][j]<35)
				{
					
					System.out.print(" sorry you are failed !");
					break;
				}
				else
				{
					//sum+=marks[i][j];
					sum2=sum2+marks[i][j];
					
				}
			 System.out.println(sum2);
			}
			//6 => 5,1+>f
			//System.out.println(" sum is:"+sum);
			//System.out.println("average is :"+(sum/3));
			System.out.println("you are student:"+(i+1));
		}
		
	}

}
