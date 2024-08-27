package Oops;

public class Overriding {

	public static void main(String[] args) {
	

		Human H1=new John();
		Human H2=new Ana();
		
		
           H1.walks();
           H2.walks();
           //Runtime-Dynamic Polymorphism.
		

	}

}

class Human{
	
	public void walks()
	{
		System.out.println("human walks");
	}
	
	protected  String talks(String str)
	{
		return "talks:"+str;
	}
	
	public void runs()
	{
		System.out.println("human runs :");
	}
	
	final String Eats()
	{
		System.out.println("Human Eats:");
		return "O";
	}
	
	
}
class John extends Human
{
    @Override
	public void walks()
	{
		System.out.println("john walks");
		//return 0;
	}
    
    
    @Override
    protected String talks(String str)
    {
    	return "John talks:"+str;
    }
    
    
    @Override
	public void runs()
	{
		System.out.println("John runs :");
	}
    
    
	
    
	
}

class Ana extends Human
{
	 @Override
		public void walks()
		{
			System.out.println("Ana walks");
			//return 0;
		}
	    
	    
	    @Override
	    public String talks(String str)
	    {
	    	return "Ana talks:"+str;
	    }
}