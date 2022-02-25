package ConstructorRevision;

public class EmployeeDetails {
	
	//Below are the Class variable.Which are expected to use throughout the program.
	String name;
	int age;
	String city;
	
	//Default constructor- Constructor with no parameter.
	
	public EmployeeDetails()
	{
		System.out.println("Fetching the details for employee...");
	}
	
	//Constructor overloading-Same constructor name but with different type and number of parameter.
	
	public EmployeeDetails(String name,int age,String city)
	{
		//this keyword will help to initialize local constructor variable value to class variable.
		//So that name,age and city variable can be used throughout the class for a particular object.
		
		this.name=name;
		this.age=age;
		this.city=city;
		
	}
	// Individual method of the class.
	public void getResults()
	{
		System.out.println("Employee name is :"+name);
		System.out.println("age  is :"+age);
		System.out.println("city name is :"+city);
	}
	

}
