package demo;

public class Encaps {

	public static void main(String[] args) {

		Employee1 emp=new Employee1();//Constructor Injection
	
		//setter methods
		emp.setId(45);
		emp.setName("mansih");
		
		//getter methods
		 System.out.println("id is:"+emp.getId());
		 System.out.println("name is:"+emp.getName());
		 
	}

}

class Employee1
{
	
	private int id;
	private String name;
	private String deparatment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparatment() {
		return deparatment;
	}
	public void setDeparatment(String deparatment) {
		this.deparatment = deparatment;
	}
	 
	
	}