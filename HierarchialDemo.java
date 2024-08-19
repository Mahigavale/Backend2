package demo;

public class HierarchialDemo {

	public static void main(String[] args) {

		
		System.out.println("the Jimmy child class.");
		Jimmy jm=new Jimmy();
		jm.address="Las Vegas";
		jm.degree="BCA";
		jm.Property=1234.67;
		jm.surname="Cook";
		System.out.println(jm.showDegree());
		jm.showInfo();
		
		
		
		System.out.println("the stuart Child class.");
		Stuart str=new Stuart();
		str.address="Silicon Valley";
		str.Business="IT";
		str.degree="B.Tech";
		str.surname="Cook";
		str.Property=23456.67;
		System.out.println(str.showDet());
		str.showInfo();
	}

}

class John
{
	String surname;
	double Property;
	String address;
	
	public void showInfo()
	{
		System.out.println("surname is: "+surname+"property is:"+Property+"Address is:"+address);
	}
}

class Jimmy extends John
{
	String degree;
	public String showDegree()
	{ 
		//String College="";
		
		return degree;
	}
}
class Stuart extends John{
	String degree;
	String Business;
	
	public String showDet()
	{
		return degree+Business;
	}
}