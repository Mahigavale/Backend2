package demo;

public class Singleinh {

	public static void main(String[] args) {
		
		child c1=new child();
		c1.name="John";
		c1.Age=45;
		c1.City="Pune";
		
		c1.Showinfo();
		
		
	}
}

class Parent{
	
	String name;
	String City;
	int Age;
	
	public void Showinfo()
	{
		System.out.println("name : "+name+" city: "+City+" Age :"+Age);
		System.out.println("the method from the Parent class.");
	}
}

class child extends Parent{	
	
	public void Showdemo()
	{
		System.out.println("the method from the child class.");
	}
}