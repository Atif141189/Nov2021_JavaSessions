package encapsulationJava;

public class EncapsulationConcept {

	// Class variable

	private String name;
	private int age;
	private double salary;

	//getter and setter method to access the private class variable.
	
	public void setName(String name)
	{	
		this.name=name; //to initialize class variable with local variable.		
	}
	
	public String getName()
	{	
		return name;		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getallDetails()
	{
		return name+": "+age+": "+"salary";
	}
	
	

}
