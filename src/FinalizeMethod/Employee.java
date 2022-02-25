package FinalizeMethod;

public class Employee {
	
	String name;

	public static void main(String[] args) 
	{
		
		Employee obj=new Employee();
		
		obj=null;
		
		System.out.println("This is employee class..");
		
		Company c1=new Company();
		
		c1=null;
		
		System.gc();
		

	}
	@Override
	public void finalize()
	{
		System.out.println("inside finalize method...Employee");
	}

}
