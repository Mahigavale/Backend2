package demo;

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C11 c1=new C11();
		c1.surname="asdfr";
		c1.Eyecolor="debjs";
		
		//Multiple => Diamond Problem Encountered !

	}

}

class P11{
	String surname;
	String Eyecolor;
}

class C11 extends P11 {
	
}

class C22 extends C11{
	
}
class C33 extends C11{
	
}