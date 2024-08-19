package demo;

public class Classdemo {

	public static void main(String[] args) {
 
		//.classObject//=>enter the class.
		
		Person Ajinkya=new Person();
		Ajinkya.age=23;
		Ajinkya.family=4;
		Ajinkya.salary=4567.89;
		
		
		Person Shubham=new Person();
		Shubham.age=23;
		Shubham.family=5;
		Shubham.salary=56787.78;
		//constructor
		//getter and setters method
		
	   Ajinkya.print_person_info();
	   
	   
	 //  int demo=Ajinkya.add_age_fam();
	//   int demo2= Shubham.add_age_fam();
	   
	   
	      System.out.println("demo:"+ Ajinkya.add_age_fam());
		  System.out.println("demo2:"+Shubham.add_age_fam());
	   
	   
	   System.out.println("**********************");
	   Shubham.print_person_info();
	
	   System.out.println("Methods with arguments !");
	  //int demo4= Ajinkya.bikes(7.8,0.78);
	   Shubham.bikes(56.78, 76.89,67);//argument=>parameters
	 //  System.out.println(demo4);
	}

}
