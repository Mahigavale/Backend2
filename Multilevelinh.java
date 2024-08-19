package demo;

public class Multilevelinh {

	public static void main(String[] args) {

		Tiger t1=new Tiger();
		t1.Species="Carniverous";
		t1.name="Jolly";
		t1.Isdomesticated=false;
		t1.showdata();
		t1.showspecies();
	}

}

class Animal{
	
	 String Species;
 //  Boolean Isdmoesticated;
   
   public void showspecies()
   {
	   System.out.println("the Species is:"+Species);
   }
}

class Catfamily extends Animal{
	String  name;
	Boolean Isdomesticated;
	
	public void showdata()
	{
		System.out.println("name is :"+name+"Is Domesticated :"+Isdomesticated);
	}
}

class Tiger extends Catfamily
{

}