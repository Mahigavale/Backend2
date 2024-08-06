package nonprimitive;

public class Calculator {
      int num1;//default =>0,0
      int num2;
	//instance variable
      //icom
	public void add()
	{
		int num3=123;
		int num4=234;
		//icim
		System.out.println("addition of Instance variable :");
		System.out.println(num1+num2);
		System.out.println("addition of local variable :");
		System.out.println(num3+num4);
	}
	
	public void sub()
	{
		System.out.println(num1-num2);
	//	System.out.println(num3-num4);
	}
	
	public void mul()
	{
		System.out.println(num1*num2);
	}
	
	public void div()
	{
		System.out.println(num1/num2);
	}
	
}
