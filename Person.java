package demo;

public class Person {
	int age;
	int family;
	double salary;

	public void print_person_info()
	{
		
		System.out.println("age is :"+age);
		System.out.println("family is:"+family);
		System.out.println("salary is :"+ salary);
	}
	
	
	public int add_age_fam()
	{
		
		return age+family; //26+6=>32=>int
	}
	
	
	public  int bikes(double price1,double price2,int num)
	{
		
		System.out.println("total is :"+(price1+price2+num));
		return 1;
	
		
	}
	
	public void printagefam()
	{
		System.out.println( add_age_fam());
		
	}
			
	
	
	
}



