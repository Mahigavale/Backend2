package demo;

public class Employee {

	
	//this.company=>
	//this.emp_id=>
	//this.emp_salary=>
	char company; //'M'
	int emp_id;
	float sal;
	
	//java gives a by default constructor
	//non-parameterized const.
	
//	public Employee() //special method =>no return type
//	{
//		System.out.println("Non-Param construcor called");
//	}
	
	public Employee(char const_copm,int const_emp,float emp_sal)
	{
		System.out.println("Param Const Called !");
	this.company=const_copm;
	this.emp_id=const_emp;
	this.sal=emp_sal;
	}
	
	public Employee()
	{
		
	}
	public void showemp()
	{
		System.out.println("company is:"+company);
		System.out.println("emp id is:"+emp_id);
		System.out.println("sal is:"+sal);
	}
}
