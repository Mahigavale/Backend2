package demo1;

public class FinalKeydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.Show();
	}

}
  class Parent
{
	String name="Abc";
	int age=23;
 final public void Show()
	{
		System.out.println(name+" "+age);
	}
}

class Child extends Parent
{
	
	public void Show1()
	{
		System.out.println("from child class");
	}
}