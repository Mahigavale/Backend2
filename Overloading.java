package Oops;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Demo2 d=new Demo2();
		
		d.add(34.56);
		
		d.add();
		
		d.add(12,34);
		
		System.out.println(Demo.add(11,22,33));
		System.out.println(d.add("Abc",45));
		System.out.println(d.add(45,"Abc"));

	}

}

class Demo
{
	public void add()
	{
		System.out.println("add from Demo");
	}
	
	public void add(int i,int j)
	{
		System.out.println(i+j);
		
	}
	
	static int add(int i,int j , int k)
	{
		return (i+j+k);
	}
	
	protected String  add(String str,int i)
	{
		return (str+i);
	}
	protected String add(int i,String str)
	{
		return "Demo";
	}
	final void add(float p)
	{
		System.out.println("denokp");
	}
}

class Demo2 extends Demo{
	public void add(double d)
	{
		System.out.println("the add method from child class");
	}
}