package Oops;

public class Overloading2 {
	public static void main(String[] args) {

		Tiger t=new Tiger();
		
		//Compile time Polymorphism
System.out.println(t.eat(1));//linking =>execution
t.eat("FOx");
t.eat("Fox", "Wolf");
}
}

class Animal{
	
	public void eat()
	{
		System.out.println("animal eats");
	}
	
	public void eat(String str)
	{
		System.out.println(str+" eats");
	}
	public void eat(String str,String str2)
	{
		System.out.println(str+str2+"eats");
	}
}
class Tiger extends Animal{
	public String eat(int i)
	{
		return "tiger eat method";
	}
}

