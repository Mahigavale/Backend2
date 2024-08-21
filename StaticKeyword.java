package demo1;

public class StaticKeyword {

	public static void main(String[] args) {
	
		
//		System.out.println(demo.i);
//		demo.show();

		//demo.demo2 d=new demo.demo2();//d.i d.k
		
		System.out.println(demo.demo2.i);  //
		System.out.println(demo.demo2.k); //
		
		//demo d=new demo();
		
		demo d1=new demo();
		
		System.out.println(demo.i);
	}

}
 class demo{
	static int i;
	
	 int j=56;
	 public static void show()
	 {
		 System.out.println("static method of demo class."+i);
	 }
	 
	 static {
		 i=56;
		  System.out.println("static called here !");
	 }
		
	 public demo()
	 {
		 System.out.println("constructor called here !");
	 }
	 
	 static class demo2{
		 
		static int i=23;
	  static  int k=56;
	 }
}