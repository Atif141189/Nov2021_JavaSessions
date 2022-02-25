package ConstructorConceptt;

public class Employee {
	
	String name;
	int age;
	String empid;
	String dept;
	
	//Constructor name is same as class name.
	//Constructor does not have any return type.
	//Constructor looks like function but not function.
	//Constructor can be overloaded.
	//constructor will be called when object is created
	
	public Employee()
	{
		System.out.println("Zero parameter constructor");
		
	
		
	}
	
	public Employee(int i,String p)
	{
		System.out.println("two parameter's constructor"+i+p);
		
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee(10,"RAM"); // 2 parameter constructor will be called automatticaly.
		
		

	}

}
